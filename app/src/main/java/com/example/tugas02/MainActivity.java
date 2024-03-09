package com.example.tugas02;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imgmotor, imgmobil, imgmoge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imgmotor = findViewById(R.id.imgmotor);
        ImageView imgmobil = findViewById(R.id.imgmobil);
        ImageView imgmoge = findViewById(R.id.imgmoge);

        imgmotor.setOnClickListener(this);
        imgmobil.setOnClickListener(this);
        imgmoge.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        Intent intent;

        if (v.getId() == R.id.imgmotor) {
            // Ganti "MotorActivity" dengan nama Activity baru untuk gambar motor
            intent = new Intent(this, MotorActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.imgmobil) {
            // Ganti "MobilActivity" dengan nama Activity baru untuk gambar mobil
            intent = new Intent(this, MobilActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.imgmoge) {
            // Ganti "MogeActivity" dengan nama Activity baru untuk gambar moge
            intent = new Intent(this, MogeActivity.class);
            startActivity(intent);
        }
    }
}