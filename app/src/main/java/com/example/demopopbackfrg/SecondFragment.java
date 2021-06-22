package com.example.demopopbackfrg;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondFragment extends Fragment {
    private final String LOG = "SECOND_FRAGMENT_LOG";

    public SecondFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(LOG, "onAttach2");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG, "onCreate2");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(LOG, "onCreatView2");
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(LOG, "onViewCreated2");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(LOG, "onActivityCreated2");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(LOG, "onStartFirst2");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(LOG, "onResume2");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(LOG, "onPause2");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(LOG, "onStop2");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(LOG, "onDestroyView2");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG, "onDestroy2");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(LOG, "onDetach2");
    }
}