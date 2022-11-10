package com.bignerdranch.android.myapplication

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class spiner1 : AppCompatActivity() {
    companion object{
        const val Log1="name"
    }
    lateinit var log: EditText
    public final var APP_SAVEL="loginsave"
    lateinit var setting:SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spiner1)
        log=findViewById(R.id.tex)
       // var name = setting.getString(prefEditor)
        //log.setText(name)


    }
    //AdapterView.OnItemSelectedListener itemSelectedListener=new AdapterView.OnItemSe


}