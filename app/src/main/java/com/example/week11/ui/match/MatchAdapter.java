package com.example.week11.ui.match;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.week11.R;
import com.example.week11.data.model.Match;
import java.util.List;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.MatchViewHolder> {
    private List<Match> matches;

    public MatchAdapter(List<Match> matches) {
        this.matches = matches;
    }

    public void updateData(List<Match> newMatches) {
        this.matches = newMatches;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MatchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_match, parent, false);
        return new MatchViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MatchViewHolder holder, int position) {
        Match match = matches.get(position);
        holder.titleTextView.setText(match.getName());
        holder.infoTextView.setText(match.getLeague() + " | " + match.getScore() + " | " + match.getDate() + " @ " + match.getStadium());
    }

    @Override
    public int getItemCount() {
        return matches != null ? matches.size() : 0;
    }

    static class MatchViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView, infoTextView;

        MatchViewHolder(View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.text_match_title);
            infoTextView = itemView.findViewById(R.id.text_match_info);
        }
    }
}
