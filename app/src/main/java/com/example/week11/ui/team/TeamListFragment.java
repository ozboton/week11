package com.example.week11.ui.team;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.week11.R;
import com.example.week11.ui.team.TeamAdapter;
import com.example.week11.data.model.Team;
import com.example.week11.data.provider.DataProvider;
import com.example.week11.data.repository.Repository;
import java.util.List;

public class TeamListFragment extends Fragment {

    private TeamAdapter adapter;
    private Repository<Team> teamRepo;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_team_list, container, false);

        teamRepo = new Repository<>();
        DataProvider.createSampleTeams().forEach(teamRepo::add);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        adapter = new TeamAdapter(teamRepo.getAll());
        recyclerView.setAdapter(adapter);

        SearchView searchView = view.findViewById(R.id.search_view);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override public boolean onQueryTextSubmit(String query) { return false; }
            @Override public boolean onQueryTextChange(String newText) {
                List<Team> filtered = teamRepo.filterByName(newText);
                adapter.updateData(filtered);
                return true;
            }
        });

        return view;
    }
}