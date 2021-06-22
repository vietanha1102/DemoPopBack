package com.example.demopopbackfrg;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ThirdFragment extends Fragment {
    private final String LOG = "THIRD_FRAGMENT_LOG";

    public ThirdFragment() {
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(LOG, "onAttach3");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG, "onCreate3");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(LOG, "onCreatView3");
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(LOG, "onViewCreated3");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(LOG, "onActivityCreated3");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(LOG, "onStartFirst3");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(LOG, "onResume3");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(LOG, "onPause3");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(LOG, "onStop3");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(LOG, "onDestroyView3");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG, "onDestroy3");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(LOG, "onDetach3");
    }
}