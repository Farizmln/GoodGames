package dev.daniel.goodgames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class AboutActivity extends AppCompatActivity {

    private static final String KEY_RATING = "STARS";
    private SharedPreferences sp;
    private SharedPreferences.Editor spEditor;
    private RatingBar ratingStar;
    private Button btnRating;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        sp = getSharedPreferences(KEY_RATING, MODE_PRIVATE);
        spEditor = sp.edit();

        ratingStar = findViewById(R.id.rating_star);
        btnRating = findViewById(R.id.btn_rating);

        ratingStar.setRating(sp.getInt(KEY_RATING, 0));

        btnRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                spEditor.putInt(KEY_RATING, (int) ratingStar.getRating());
                spEditor.apply();
                switch ((int) ratingStar.getRating()) {
                    case 1:
                        Toast.makeText(AboutActivity.this, "That's too bad :(", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(AboutActivity.this, "Sorry to hear that :(", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(AboutActivity.this, "Thank you!", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(AboutActivity.this, "Appreciate it, thanks a lot!", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(AboutActivity.this, "Perfect, thank you so much!", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        Toast.makeText(AboutActivity.this, "Please rate this app!", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }


    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return super.onSupportNavigateUp();
    }
}
