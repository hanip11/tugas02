package com.example.tugas02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MobilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobil);

        CardView firstCard = findViewById(R.id.firstcardmobil);
        firstCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the click event for the first card
                navigateToDetailActivity(
                        R.drawable.civic,
                        "Civic Turbo 1500cc",
                        "Di generasi kesepuluh ini Honda Civic Turbo terlihat punya desain yang sangat sporty. Hal tersebut dapat dilihat dari bagian depan, samping, dan belakangnya yang punya banyak lekukan tajam. Bagi orang awam, lekuk tajam ini terlihat cukup menjadikannya mobil yang punya nuansa sporty.\"",
                        "Harga: Rp 533.000.000",
                        "Share"
                );
            }
        });

        // Repeat the above process for other cards as needed.
        // For example, for the second card:
        CardView secondCard = findViewById(R.id.secondCardmobil);
        secondCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the click event for the second card
                navigateToDetailActivity(
                        R.drawable.crv,
                        "Crv 1500cc",
                        "Honda CR-V ini terus berkembang dan mengalami berbagai pembaruan yang membuatnya semakin menarik. Saat ini, Honda CR-V telah dijual secara global dan sukses menjadi salah satu model mobil yang mewakili merek Honda.",
                        "Harga: Rp 495.000.000",
                        "Share"
                );
            }
        });

        CardView thirdCard = findViewById(R.id.thirdCardmobil);
        thirdCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToDetailActivity(
                        R.drawable.brv,
                        "Brv 1500cc",
                        "Honda BR-V adalah mobil SUV yang diproduksi oleh Honda sejak tahun 2015. Mobil ini memiliki desain yang elegan dan cukup lapang di dalamnya, cocok untuk kebutuhan keluarga.",
                        "Harga: Rp 363.000.000",
                        "Share"
                );
            }
        });

// Code untuk fourthCard
        CardView fourthCard = findViewById(R.id.fourthCardmobil);
        fourthCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToDetailActivity(
                        R.drawable.hrv,
                        "Hrv 1500cc",
                        "Honda HR-V adalah mobil crossover yang memiliki gaya sporty dan desain interior yang nyaman. Dilengkapi dengan berbagai fitur modern, HR-V menjadi pilihan yang menarik di kelasnya.",
                        "Harga: Rp 415.000.000",
                        "Share"
                );
            }
        });

// Code untuk fifthCard
        CardView fifthCard = findViewById(R.id.fifthCardmobil);
        fifthCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToDetailActivity(
                        R.drawable.jazz,
                        "Jazz 1500cc",
                        "Honda Jazz memiliki desain yang dinamis dan kompak, membuatnya cocok untuk berkendara di perkotaan. Selain itu, Jazz juga dikenal dengan ruang kabinnya yang luas dan fitur-fitur canggih.",
                        "Harga: Rp 256.000.000",
                        "Share"
                );
            }
        });

        // Continue for other cards...
    }

    private void navigateToDetailActivity(int imageResId, String title, String description, String price, String share) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("imageResId", imageResId);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
        intent.putExtra("price", price);
        intent.putExtra("share", share);
        startActivity(intent);
    }
}
