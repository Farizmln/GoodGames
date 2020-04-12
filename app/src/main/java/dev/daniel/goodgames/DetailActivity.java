package dev.daniel.goodgames;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    public static final String GAME_KEY = "game";
    private ImageView imgGame;
    private TextView tvTitle, tvRelease, tvDeveloper, tvPublisher, tvGenre, tvDescription;
    private Button btnDownload;
    private Game game;
    private RecyclerView rvGameScreenShot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if (getIntent() != null) {
            game = (Game) getIntent().getSerializableExtra(GAME_KEY);
        }

        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        rvGameScreenShot = findViewById(R.id.rv_games_screenshot);
        rvGameScreenShot.setHasFixedSize(true);
        imgGame = findViewById(R.id.img_game);
        tvTitle = findViewById(R.id.tv_title);
        tvRelease = findViewById(R.id.tv_release);
        tvDeveloper = findViewById(R.id.tv_developer);
        tvPublisher = findViewById(R.id.tv_publisher);
        tvGenre = findViewById(R.id.tv_genre);
        tvDescription = findViewById(R.id.tv_description);
        btnDownload = findViewById(R.id.btn_download);

        Glide.with(this)
                .load(game.getImage())
                .apply(new RequestOptions().override(1200, 800))
                .into(imgGame);
        tvTitle.setText(game.getTitle());
        tvRelease.setText(game.getRelease());
        tvDeveloper.setText(game.getDeveloper());
        tvPublisher.setText(game.getPublisher());
        tvGenre.setText(game.getGenre());
        tvDescription.setText(game.getDescription());
        showRecyclerScreenShot();

        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(game.getLink()));
                startActivity(intent);
            }
        });
    }

    private void showRecyclerScreenShot() {
        GameScreenShotAdapter adapter = new GameScreenShotAdapter(game.getScreenshot());
        rvGameScreenShot.setLayoutManager(new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false));
        rvGameScreenShot.setAdapter(adapter);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
