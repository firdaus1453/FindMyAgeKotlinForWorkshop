package com.example.find_my_age_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // TODO 1 Membuat pendeteksi pada saat button di tekan
        btnHitung.setOnClickListener {

            // TODO 2 Mengambil inputan user dari widget edtTahunLahir
            val tahunLahir = edtTahunLahir.text.toString().toIntOrNull()

            // TODO 3 Mencek apakah inputan user ada isinya
            if(tahunLahir != null){

                // TODO 4 Melakukan operasi perhitungan umur dengan rumus tahun sekarang - tahun lahir
                val umurSekarang = Calendar.getInstance().get(Calendar.YEAR) - tahunLahir

                // TODO 5 Menampilkan hasil umur ke layar
                txtUmur.text = umurSekarang.toString()

            } else {

                // TODO 6 Menampilkan pesan error ke layar
                edtTahunLahir.error = "Masukkan tahun lahir"
            }

        }
    }
}
