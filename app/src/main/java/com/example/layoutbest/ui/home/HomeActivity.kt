package com.example.layoutbest.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.layoutbest.R
import com.example.layoutbest.ui.Dapur.DapurFragment
import com.example.layoutbest.ui.anak.AnakFragment
import com.example.layoutbest.ui.makanan.MakananFragment
import com.example.layoutbest.ui.sehat.SehatFragment

class HomeActivity : AppCompatActivity(), View.OnClickListener  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val makanan: LinearLayout = findViewById(R.id.mkn)
        makanan.setOnClickListener(this)

        val peralatan: LinearLayout = findViewById(R.id.krs)
        peralatan.setOnClickListener(this)

        val anak: LinearLayout = findViewById(R.id.ank)
        anak.setOnClickListener(this)

        val pil: LinearLayout = findViewById(R.id.pl)
        pil.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.makan -> {
                val makanan = Intent(this, MakananFragment::class.java)
                startActivity(makanan)
            }
            R.id.kursi -> {
                val peralatan = Intent(this, DapurFragment::class.java)
                startActivity(peralatan)
            }
            R.id.anak -> {
                val anak = Intent(this, AnakFragment::class.java)
                startActivity(anak)
            }
            R.id.pil -> {
                val pil = Intent(this, SehatFragment::class.java)
                startActivity(pil)
            }
        }
    }
}