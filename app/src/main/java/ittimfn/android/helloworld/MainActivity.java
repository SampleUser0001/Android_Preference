package ittimfn.android.helloworld;

import ittimfn.android.helloworld.R;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.content.Intent;

import ittimfn.android.helloworld.R;
import ittimfn.android.helloworld.SettingsActivity;
import ittimfn.android.helloworld.fragment.SettingsFragment;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private Button settingsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        settingsButton = findViewById(R.id.button_open_preferences);
        settingsButton.setOnClickListener(v -> {
            // 設定画面を表示
            startActivity(new Intent(MainActivity.this, SettingsActivity.class));
        });
    }
}