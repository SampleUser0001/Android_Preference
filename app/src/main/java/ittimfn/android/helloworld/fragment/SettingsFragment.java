package ittimfn.android.helloworld.fragment;

import android.os.Bundle;
import androidx.preference.PreferenceFragmentCompat;

import ittimfn.android.helloworld.R;

public class SettingsFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        // res/xml/preferences.xml に定義した PreferenceScreen を読み込む
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }
}
