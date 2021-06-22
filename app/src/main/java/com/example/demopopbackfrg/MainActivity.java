package com.example.demopopbackfrg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    FrameLayout frameLayout;
    Button btnAdd1, btnAdd2, btnAdd3, btnReplace, btnRemove, btnBack, btnPopFirstFrg;
    private final String LOG = "MAIN_ACTIVITY_LOG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOG, "onCreatetM");
        
        // nghich linh tinh lan 1

        frameLayout = findViewById(R.id.frLayoutMain);
        btnAdd1 = findViewById(R.id.btnAddFrg1);
        btnAdd2 = findViewById(R.id.btnAddFrg2);
        btnAdd3 = findViewById(R.id.btnAddFrg3);
        btnReplace = findViewById(R.id.btnReplace);
        btnRemove = findViewById(R.id.btnRemove);
        btnBack = findViewById(R.id.btnBack);
        btnPopFirstFrg = findViewById(R.id.btnPopFirst);

        //addFrg(new FirstFragment(),"FirstFragment");

        btnAdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFrg(new FirstFragment(),"FirstFragment");
            }
        });

        btnAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFrg(new SecondFragment(),"SecondFragment");
            }
        });

        btnAdd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addFrg(new ThirdFragment(),"ThirdFragment");
            }
        });

        btnReplace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                replaceFrg(new SecondFragment());
            }
        });

        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                remove();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().popBackStack();
            }
        });

        btnPopFirstFrg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().popBackStack("FirstFragment",0);
            }
        });
    }

    public void addFrg(Fragment fragment,String nameFrg) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.frLayoutMain, fragment, nameFrg);
        transaction.addToBackStack(nameFrg);
        transaction.commit();
    }

    public void replaceFrg(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frLayoutMain, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    public void remove() {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.remove(getSupportFragmentManager().findFragmentById(R.id.frLayoutMain));
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOG, "onStartM");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOG, "onResumeM");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOG, "onPauseM");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOG, "onStopM");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOG, "onReStartM");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG, "onDestroyM");
    }
}
