package com.example.opilane.hullapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Saada(View view) {
        Intent intent = new Intent(MainActivity.this, Skins.class);
        startActivity(intent);
    }

    public void Siht(View view) {Intent intent = new Intent(MainActivity.this, csgostash.class);
        startActivity(intent);
    }

    public void netileht(View view) {
        String url="https://csgostash.com/";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);

    }
}
