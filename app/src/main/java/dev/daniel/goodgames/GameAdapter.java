package dev.daniel.goodgames;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameViewHolder> implements Filterable {

    private ArrayList<Game> listGame;
    private ArrayList<Game> listFull;
    private OnItemClickListener callback;

    public GameAdapter(ArrayList<Game> listGame) {
        this.listGame = listGame;
        listFull = new ArrayList<>(listGame);
    }

    public void setOnItemClickListener(OnItemClickListener callback) {
        this.callback = callback;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_game, parent, false);
        return new GameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        final Game currentGame = listGame.get(position);
        Glide.with(holder.itemView.getContext())
                .load(currentGame.getImage())
                .apply(new RequestOptions().override(600, 400))
                .into(holder.imgGame);
        holder.tvTitle.setText(currentGame.getTitle());
        holder.tvYear.setText(currentGame.getYearRelease());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callback.onItemClick(currentGame);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listGame.size();
    }

    @Override
    public Filter getFilter() {
        return gameFilter;
    }

    private Filter gameFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<Game> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(listFull);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();

                for (Game game: listFull) {
                    if (game.getTitle().toLowerCase().contains(filterPattern)) {
                        filteredList.add(game);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            listGame.clear();
            listGame.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };

    public class GameViewHolder extends RecyclerView.ViewHolder {
        ImageView imgGame;
        TextView tvTitle, tvYear;

        public GameViewHolder(@NonNull View itemView) {
            super(itemView);
            imgGame = itemView.findViewById(R.id.item_img_game);
            tvTitle = itemView.findViewById(R.id.item_tv_title);
            tvYear = itemView.findViewById(R.id.item_tv_year);
        }
    }

    interface OnItemClickListener {
        void onItemClick(Game data);
    }
}
