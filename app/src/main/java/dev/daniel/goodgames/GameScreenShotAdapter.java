package dev.daniel.goodgames;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GameScreenShotAdapter extends RecyclerView.Adapter<GameScreenShotAdapter.GameScreenShotViewHolder> {

    private int[] screenShot;

    public GameScreenShotAdapter(int[] screenShot) {
        this.screenShot = screenShot;
    }

    @NonNull
    @Override
    public GameScreenShotViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_game_screenshot, parent, false);
        return new GameScreenShotViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameScreenShotViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(screenShot[position])
                .apply(new RequestOptions().override(900, 600))
                .into(holder.imgGameScreenShot);
    }

    @Override
    public int getItemCount() {
        return screenShot.length;
    }

    public class GameScreenShotViewHolder extends RecyclerView.ViewHolder {
        ImageView imgGameScreenShot;
        public GameScreenShotViewHolder(@NonNull View itemView) {
            super(itemView);
            imgGameScreenShot = itemView.findViewById(R.id.item_img_game_ss);
        }
    }
}
