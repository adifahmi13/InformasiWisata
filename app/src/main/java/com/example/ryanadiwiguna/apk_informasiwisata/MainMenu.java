package com.example.ryanadiwiguna.apk_informasiwisata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void pindah(View view) {
        Intent p = new Intent(MainMenu.this , MainActivity.class);
        startActivity(p);
    }

    public void alam (View view) {
        Intent i = new Intent(MainMenu.this , Main_Alam.class);
        startActivity(i);
    }
}
