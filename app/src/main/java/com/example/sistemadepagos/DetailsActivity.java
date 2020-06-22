package com.example.sistemadepagos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imageView = findViewById(R.id.img_details);
        textView = findViewById(R.id.txt_details);

        Bundle bndle = getIntent().getExtras();
        int img = bndle.getInt("img");
        String text = bndle.getString("txt");

        imageView.setImageResource(img);
        textView.setText(text);



    }
}
