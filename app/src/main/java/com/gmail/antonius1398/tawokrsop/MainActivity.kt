package com.gmail.antonius1398.tawokrsop

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    internal lateinit var editText1: EditText
    internal lateinit var editText2: EditText //Deklarasi object dari class EdiText
    internal lateinit var text1: String
    internal lateinit var text2: String //Deklarasi object string


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.title = "Antonius Jonatan"
        supportActionBar!!.subtitle = "165410095"

    }

    fun loginMasuk(view: View) {
        //Method onClick pada Button

        editText1 = findViewById<View>(R.id.edittext_username) as EditText
        editText2 = findViewById<View>(R.id.edittext_password) as EditText
        text1 = editText1.text.toString()
        text2 = editText2.text.toString()

        //Kondisi jika username dan password benar maka akan menampilkan pesan text toast
        //Login sukses dan masuk ke activity 2
        if (text1.contains("Antonius") && text2.contains("165410095")) {
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity, Main2Activity::class.java)
            startActivity(intent)
        } else if (text1.matches("".toRegex()) || text2.matches("".toRegex()))
        /*
          Atau jika input text 1 dan text 2 kosong
           */ {
            //Maka akan menampilkan pesan text toast
            Toast.makeText(this, "Isikan Username dan Password", Toast.LENGTH_SHORT).show()

        } else {
            //jika kedua kondisi diatas tidak memenuhi

            Toast.makeText(this, "Login Gagal /Username Password Salah", Toast.LENGTH_SHORT).show()
        }

    }


}