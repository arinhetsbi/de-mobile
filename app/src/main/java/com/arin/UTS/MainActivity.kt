package com.arin.UTS

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var berita: CardView
    private lateinit var kal: CardView
    private lateinit var keluar: CardView
    private lateinit var ten: CardView


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        berita = findViewById(R.id.berita)
        berita.setOnClickListener {
            startActivity(Intent(this, BeritaActivity::class.java))
        }

        kal = findViewById(R.id.kal)
        kal.setOnClickListener {
            startActivity(Intent(this, KalActivity::class.java))
        }

        ten = findViewById(R.id.ten)
        ten.setOnClickListener {
            startActivity(Intent(this, AboutActivity::class.java))
        }

        keluar = findViewById(R.id.keluar)
        keluar.setOnClickListener {
            finish()
            System.exit(0)
        }

    }
 }