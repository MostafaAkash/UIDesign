package com.example.listviewwithuidesign;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


public class MainActivity extends AppCompatActivity {
    private Button openFirstFragment;
    private Button openSecondFragment;
    private Button openThirdFragment;
    private Fragment fragment = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        openFirstFragment.setOnClickListener(firstListener);
        openSecondFragment.setOnClickListener(secondListener);
        openThirdFragment.setOnClickListener(secondListener);

    }
    private View.OnClickListener firstListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            fragment = new FirstFragment();
            openFragment(fragment);
        }
    };
    private View.OnClickListener secondListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            fragment = new SecondFragment();
            openFragment(fragment);
        }
    };

    private View.OnClickListener thirdListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            fragment = new SecondFragment();
            openFragment(fragment);
        }
    };



    private void init() {
        openFirstFragment = findViewById(R.id.first_button_main_ac);
        openSecondFragment = findViewById(R.id.second_button_main_ac);
        openThirdFragment = findViewById(R.id.third_button_main_ac);
    }

    private void openFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout_id_main_ac, fragment).commit();

    }


}
