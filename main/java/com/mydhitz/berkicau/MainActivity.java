package com.mydhitz.berkicau;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnmurai (View view){
        Intent intent = new Intent(this, MuraiUtama.class);
        startActivity(intent);
    }
    public void btnkenari (View view){
        Intent intent = new Intent(this,KenariUtama.class);
        startActivity(intent);
    }
    public void btnlovebird (View view){
        Intent intent = new Intent(this,LovebirdUtama.class);
        startActivity(intent);
    }
    public void btnpleci (View view){
        Intent intent = new Intent(this,PleciUtama.class);
        startActivity(intent);
    }
}
