package ittimfn.android.helloworld;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import ittimfn.android.helloworld.fragment.SettingsFragment;

public class SettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // コンテンツビューはフラグメントで置き換えるため不要（layout を用意しても OK）
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(android.R.id.content, new SettingsFragment());
        ft.commit();
    }
}
