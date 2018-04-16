package com.example.yurina.btsactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Bts2Activity extends AppCompatActivity {

    ArrayList<Bts> arrayList;
    Bts bts;
    ImageView image2;
    ImageView image3;
    TextView feature;
    Button backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bts2);

        final Intent intent = getIntent();

        bts = new Bts();

        bts.setImage2(intent.getExtras().getString("image2"));
        bts.setImage3(intent.getExtras().getString("image3"));
        bts.setFeature(intent.getExtras().getString("feature"));

        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        feature = findViewById(R.id.feature);
        backbtn = findViewById(R.id.backbtn);


        Glide.with(this).load(bts.getImage2()).centerCrop().into(image2);
        Glide.with(this).load(bts.getImage3()).centerCrop().into(image3);
        feature.setText(bts.getFeature());

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Bts2Activity.this, BTSActivity.class);
                startActivity(intent1);
            }
        });
    }


}
