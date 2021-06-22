package com.example.demopopbackfrg;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FirstFragment extends Fragment {
private final String LOG = "FIRST_FRAGMENT_LOG";
    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d(LOG,"onAttach1");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG,"onCreate1");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(LOG,"onCreatView1");
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(View view,Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.d(LOG,"onViewCreated1");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(LOG,"onActivityCreated1");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(LOG,"onStartFirst1");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(LOG,"onResume1");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(LOG,"onPause1");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(LOG,"onStop1");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d(LOG,"onDestroyView1");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(LOG,"onDestroy1");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d(LOG,"onDetach1");
    }
}