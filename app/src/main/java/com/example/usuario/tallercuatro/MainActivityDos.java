package com.example.usuario.tallercuatro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class MainActivityDos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dos);

        Button btn_opc = (Button) findViewById(R.id.button_1);
        registerForContextMenu(btn_opc);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab_2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goActivityOne(view);
            }
        });
    }

    public void goActivityOne(View view) {
        Intent intent = new Intent(this, MainActivityUno.class);
        startActivity(intent);
    }
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo){
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater=getMenuInflater();
        menu.setHeaderTitle("Mis Opciones");
        inflater.inflate(R.menu.menu_opc, menu);
    }
}