package com.example.tugas02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView detailImage = findViewById(R.id.detailImage);
        TextView detailTitle = findViewById(R.id.detailTitle);
        TextView detailDescription = findViewById(R.id.detailDescription);
        TextView detailPrice = findViewById(R.id.detailPrice);
        Button btnShare = findViewById(R.id.btnShare);

        // Dapatkan data dari Intent
        int imageResId = getIntent().getIntExtra("imageResId", 0);
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        detailDescription.setText(description);
        String price = getIntent().getStringExtra("price");
        String share = getIntent().getStringExtra("share");
        btnShare.setText(share);

        // Atur data ke tampilan
        detailImage.setImageResource(imageResId);
        detailTitle.setText(title);
        detailPrice.setText(price);

        // Tambahkan listener untuk tombol Share
        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shareContent();
            }
        });
    }

    private void shareContent() {
        // Dapatkan data dari Intent
        String title = getIntent().getStringExtra("title");
        String price = getIntent().getStringExtra("price");

        // Membuat pesan yang akan dibagikan
        String shareMessage =  title + "\n\n" + price;

        // Buat Intent untuk berbagi
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Sharing " + title);
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);

        // Memastikan ada aplikasi yang dapat menangani Intent
        if (shareIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(Intent.createChooser(shareIntent, "Share via"));
        }
    }
}









