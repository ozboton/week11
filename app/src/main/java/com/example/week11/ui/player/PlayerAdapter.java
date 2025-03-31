package com.example.week11.ui.player;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.week11.R;
import com.example.week11.data.model.Player;
import java.util.List;

public class PlayerAdapter extends RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder> {
    private List<Player> players;

    public PlayerAdapter(List<Player> players) {
        this.players = players;
    }

    public void updateData(List<Player> newPlayers) {
        this.players = newPlayers;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public PlayerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_player, parent, false);
        return new PlayerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlayerViewHolder holder, int position) {
        Player player = players.get(position);
        holder.nameTextView.setText(player.getName());
        holder.infoTextView.setText(player.getPosition() + " | Age: " + player.getAge() +
                " | " + player.getNationality() +" | " + player.getTeam() + " | #" + player.getId().split(":" )[1]);
    }

    @Override
    public int getItemCount() {
        return players != null ? players.size() : 0;
    }

    static class PlayerViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView, infoTextView;

        PlayerViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.text_player_name);
            infoTextView = itemView.findViewById(R.id.text_player_info);
        }
    }
}