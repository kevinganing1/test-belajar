package com.example.tugaspab1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button kelompok ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kelompok =findViewById(R.id.bAnggota);
    }

    public void aAnggota(View view) {
        startActivity(new Intent(MainActivity.this,Anggota.class));

    }
}