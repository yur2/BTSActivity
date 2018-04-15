package com.example.yurina.btsactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Bts2Activity extends AppCompatActivity {

    ArrayList<Bts> arrayList;
    Bts bts;
    ImageView image2;
    ImageView image3;
    TextView feature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bts2);

        Intent intent = getIntent();

        bts = new Bts();

        bts.setImage2(intent.getExtras().getString("image2"));

        image2 = findViewById(R.id.image2);

        image2.setImageResource(bts.getImage2());
    }


}
