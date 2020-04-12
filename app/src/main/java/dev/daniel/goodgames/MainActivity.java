package dev.daniel.goodgames;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvGames;
    private ArrayList<Game> listGame = new ArrayList<>();
    private GameAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_about);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        rvGames = findViewById(R.id.rv_games);
        rvGames.setHasFixedSize(true);
        listGame.addAll(GameData.getGameData());
        showRecyclerGame();

    }

    private void showRecyclerGame() {
        adapter = new GameAdapter(listGame);
        rvGames.setLayoutManager(new LinearLayoutManager(this));
        rvGames.setAdapter(adapter);
        adapter.setOnItemClickListener(new GameAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Game data) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(DetailActivity.GAME_KEY, data);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        androidx.appcompat.widget.SearchView searchView = (androidx.appcompat.widget.SearchView) searchItem.getActionView();
        searchView.setImeOptions(EditorInfo.IME_ACTION_DONE);
        searchView.setQueryHint("Search game here...");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onSupportNavigateUp() {
        Intent intent = new Intent(this, AboutActivity.class);
        startActivity(intent);
        return super.onSupportNavigateUp();
    }
}
