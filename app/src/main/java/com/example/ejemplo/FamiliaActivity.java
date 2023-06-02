package com.example.ejemplo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FamiliaActivity extends AppCompatActivity {

    public CardView familia2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_familia);

        familia2 = (CardView) findViewById(R.id.familia2);


        familia2.setOnClickListener(this::onClick);
    }

    public void onClick(View v){
        Intent i;

        switch (v.getId()){
            case R.id.familia2:
                i = new Intent(this,PalabraFamilia.class);
                startActivity(i);
                break;

        }


    }
}