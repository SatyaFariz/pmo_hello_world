package com.fariz.pmo_hello_world;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // membuat layout dengan Linear Layout
        LinearLayout linearLayout = new LinearLayout(this);

        // kasih layout dengan tinggi dan lebar yang maksimal (yang tersedia)
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(
             LinearLayout.LayoutParams.MATCH_PARENT, // lebar maksimal (sesuai ukuran layar)
             LinearLayout.LayoutParams.MATCH_PARENT // tinggi maksimal (ukuran layar - tinggi header)
        ));

        // menempatkan test di tengah-tengah layout
        linearLayout.setGravity(Gravity.CENTER);

        // membuat text
        TextView tv = new TextView(this);
        // text diberi text "Hello World!"
        tv.setText("Hello World!");
        // masukkan text ke dalam layout
        linearLayout.addView(tv);
        // tampilkan layout sebagai layar utama aplikasi
        setContentView(linearLayout);
    }
}
