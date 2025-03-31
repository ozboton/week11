package com.example.week11.ui.team;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.week11.R;
import com.example.week11.data.model.Team;
import java.util.List;

public class TeamAdapter extends RecyclerView.Adapter<TeamAdapter.TeamViewHolder> {
    private List<Team> teams;

    public TeamAdapter(List<Team> teams) {
        this.teams = teams;
    }

    public void updateData(List<Team> newTeams) {
        this.teams = newTeams;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TeamViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_team, parent, false);
        return new TeamViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TeamViewHolder holder, int position) {
        Team team = teams.get(position);
        holder.nameTextView.setText(team.getName());
        holder.leagueTextView.setText(team.getCountry() + " | " + team.getLeague() + " | " + team.getStadium() + " | " + team.getFoundingYear());
    }

    @Override
    public int getItemCount() {
        return teams != null ? teams.size() : 0;
    }

    static class TeamViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView, leagueTextView;

        TeamViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.text_team_name);
            leagueTextView = itemView.findViewById(R.id.text_team_league);
        }
    }
}
