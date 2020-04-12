package dev.daniel.goodgames;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.IpSecManager;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen extends AppCompatActivity {

    private Timer timer;
    private ProgressBar progressBar;
    private int i = 0;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        progressBar = findViewById(R.id.progress_bar);
        textView = findViewById(R.id.tv_progress);

        final long period = 50;
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                //this repeats every 100 ms
                if (i < 100) {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            textView.setText(String.format("%s %%", String.valueOf(i)));
                        }
                    });
                    progressBar.setProgress(i);
                    i++;
                } else {
                    //closing the timer
                    timer.cancel();
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                    // close this activity
                    finish();
                }
            }
        }, 0, period);

    }


//    private void progressAnimation() {
//        ProgressBarAnimation progressBarAnimation = new ProgressBarAnimation(this, progressBar, textView, 0f, 100f);
//        progressBarAnimation.setDuration(8000);
//        progressBar.setAnimation(progressBarAnimation);
//    }
}
