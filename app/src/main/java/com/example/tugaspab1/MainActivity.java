package com.example.tugaspab1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
public class MainActivity extends AppCompatActivity {
    private int anggota;
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void aAnggota(View view) {
        Log.d(LOG_TAG , "Button clicked ");

        Intent intent = new Intent(this , Anggota.class );

    }
}