package com.example.tugas02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MotorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motor2);

        CardView firstCard = findViewById(R.id.firstcard);
        firstCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the click event for the first card
                navigateToDetailActivity(
                        R.drawable.aerox,
                        "Yamaha Aerox 155",
                        "Yamaha Aerox 155 adalah skuter matik sporty yang menawarkan kombinasi desain futuristik, performa tinggi, dan fitur canggih. Ditenagai oleh mesin berkapasitas 155cc, Aerox memberikan akselerasi responsif dan kecepatan tinggi.",
                        "Harga: Rp 29.000.000",
                        "Share"
                );
            }
        });

        // Repeat the above process for other cards as needed.
        // For example, for the second card:
        CardView secondCard = findViewById(R.id.secondCard);
        secondCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle the click event for the second card
                navigateToDetailActivity(
                        R.drawable.nmax,
                        "Yamaha Nmax 155",
                        "Yamaha NMAX adalah skuter matik yang populer dan elegan yang diproduksi oleh Yamaha Motor Company. Skuter ini menawarkan gaya modern, performa handal, dan berbagai fitur canggih yang membuatnya menjadi pilihan yang menarik bagi pengendara perkotaan.",
                        "Harga: Rp 33.000.000",
                        "Share"
                );
            }
        });
        CardView thirdCard = findViewById(R.id.thirdCard);
        thirdCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToDetailActivity(
                        R.drawable.xmax,
                        "Yamaha Xmax 250",
                        "Yamaha XMAX adalah skuter matic premium yang dikembangkan oleh Yamaha Motor Company. Skuter ini memiliki desain modern dan elegan dengan fitur-fitur yang membuatnya menjadi pilihan yang menarik di segmen skuter kelas menengah.",
                        "Harga: Rp 71.000.000",
                        "Share"
                );
            }
        });

// Code untuk fourthCard
        CardView fourthCard = findViewById(R.id.fourthCard);
        fourthCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToDetailActivity(
                        R.drawable.lexi,
                        "Yamaha Lexi 155",
                        "Yamaha Lexi adalah skuter matik yang memadukan desain modern, performa handal, dan teknologi terkini untuk memberikan pengalaman berkendara yang optimal. Dengan bentuk aerodinamis yang elegan, Lexi menawarkan tampilan yang stylish dan eye-catching.",
                        "Harga: Rp 28.000.000",
                        "Share"
                );
            }
        });

// Code untuk fifthCard
        CardView fifthCard = findViewById(R.id.fifthCard);
        fifthCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToDetailActivity(
                        R.drawable.fazio,
                        "Yamaha Fazio 125",
                        "Desainnya yang futuristik dan stylish. Yamaha benar-benar memperhatikan hingga detail kecil pada desain motor ini.Dari lampu depan LED hingga panel instrumen digital yang elegan, semuanya memberikan kesan mewah dan elegan. Sobat yang ingin tampil beda di jalan pasti akan sangat menyukai tampilan motor ini.",
                        "Harga: Rp 22.000.000",
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
