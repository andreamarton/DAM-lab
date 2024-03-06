package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1=findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager=getSupportFragmentManager();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainerView,FirstFragment.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name")
                        .commit();
            }
        });
        Button button2=findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager1=getSupportFragmentManager();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainerView,SecondFragment.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name1")
                        .commit();
            }
        });Button button3=findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager2=getSupportFragmentManager();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainerView,ThirdFragment.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name2")
                        .commit();
            }
        });
        Button button4=findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager3=getSupportFragmentManager();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainerView,FourthFragment.class,null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name3")
                        .commit();
            }
        });

    }
}