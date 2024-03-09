package com.example.tugas02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MogeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moge);

        CardView firstCard = findViewById(R.id.firstcardmoge);
        firstCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the click event for the first card
                navigateToDetailActivity(
                        R.drawable.h2,
                        "Kawasaki Ninja H2",
                        "Kawasaki Ninja H2 adalah sepeda motor sport kelas atas yang menonjolkan kecanggihan teknologi dan desain futuristik. Dikenal sebagai salah satu sepeda motor tercepat di dunia, Ninja H2 memadukan performa tinggi dengan estetika yang menakjubkan.",
                        "Harga: Rp 999.000.000",
                        "Share"
                );
            }
        });

        // Repeat the above process for other cards as needed.
        // For example, for the second card:
        CardView secondCard = findViewById(R.id.secondCardmoge);
        secondCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the click event for the second card
                navigateToDetailActivity(
                        R.drawable.r1,
                        "Yamaha R1",
                        "Dilengkapi dengan mesin empat silinder berkapasitas tinggi,R1 menghasilkan tenaga yang mengesankan, memberikan akselerasi yang luar biasa di lintasan lurus dan kemampuan manuver yang presisi di tikungan. Sistem kontrol traksi, quick-shifter, dan sistem pengereman canggih membuatnya menjadi salah satu sepeda motor paling canggih di kelasnya.",
                        "Harga: Rp 900.000.000",
                        "Share"
                );
            }
        });
        CardView thirdCard = findViewById(R.id.thirdCardmoge);
        thirdCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToDetailActivity(
                        R.drawable.r6,
                        "Yamaha R6",
                        "Yamaha R6 merupakan pilihan ideal bagi pengendara yang mencari sepeda motor sport berkinerja tinggi dengan fokus pada kehandalan dan manuverabilitas. Dikembangkan dengan inspirasi dari saudara besar R1, R6 menawarkan kombinasi antara kecepatan dan kestabilan yang cocok untuk pengendara berpengalaman.",
                        "Harga: Rp 550.000.000",
                        "Share"
                );
            }
        });

// Code untuk fourthCard
        CardView fourthCard = findViewById(R.id.fourthCardmoge);
        fourthCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToDetailActivity(
                        R.drawable.zx_636,
                        "Kawasaki zx 636",
                        "Kawasaki Ninja ZX-6R, atau sering disebut ZX-636, adalah representasi yang luar biasa dari kecanggihan teknologi dan performa tinggi dalam kelas sepeda motor sport. Didesain untuk memberikan pengalaman berkendara yang memikat, ZX-6R menonjol dengan mesin empat silinder 636cc yang penuh tenaga.",
                        "Harga: Rp 600.000.000",
                        "Share"
                );
            }
        });

// Code untuk fifthCard
        CardView fifthCard = findViewById(R.id.fifthCardmoge);
        fifthCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToDetailActivity(
                        R.drawable.zx_4r,
                        "Kawasaki zx 4r",
                        " Kawasaki Ninja ZX-4R didukung oleh mesin empat silinder segaris berkapasitas 400 cc. Mesin ini dilengkapi dengan teknologi canggih, seperti DOHC (Double Overhead Camshaft) dan pendinginan cairan. Ini menghasilkan tenaga sebesar 98,6 hp pada 12.000 rpm dan torsi 59 lb-ft pada 9.000 rpm, memberikan akselerasi yang sangat kuat dan respon gas yang luar biasa.",
                        "Harga: Rp 430.000.000",
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
