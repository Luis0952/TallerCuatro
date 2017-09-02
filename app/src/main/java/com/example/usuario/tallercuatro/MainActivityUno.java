package com.example.usuario.tallercuatro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivityUno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_uno);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    goActivityTwo(view);
                }
        });
    }

    public void goActivityTwo(View view) {
        Intent intent =new Intent(this, MainActivityDos.class);
        startActivity(intent);
    }
}
