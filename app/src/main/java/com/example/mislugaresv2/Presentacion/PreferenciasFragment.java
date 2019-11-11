package com.example.mislugaresv2.Presentacion;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.example.mislugaresv2.R;

public class PreferenciasFragment extends PreferenceFragment {
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }
}