package com.bignerdranch.android.myapplication

import android.app.AlertDialog
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.bignerdranch.android.myapplication.spiner1.Companion.Log1

class MainActivity : AppCompatActivity() {
    lateinit var loginin:Button
    lateinit var log:EditText
    lateinit var pin:EditText
    public final var APP_SAVEL="loginsave"
    lateinit var setting:SharedPreferences
    public var prefEditor=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        log=findViewById(R.id.login)
        pin=findViewById(R.id.pass)

    }
    fun prov(view: View)
    {    if(log.getText().isNotEmpty()||pin.getText().isNotEmpty())
        {
            var intent = Intent(this,spiner1::class.java)
            log=findViewById(R.id.login)
            var name=log.getText().toString();
            var prefEditor=setting.edit();
            prefEditor.putString(APP_SAVEL,name)
            prefEditor.apply();
            intent.putExtra(spiner1, Log1,name)
            startActivity(intent)


        }
        else
        {
            var alert=AlertDialog.Builder(this)
                .setTitle("error")
                .setMessage("заполните поля для входа")
                .setPositiveButton("ok",null)
                .create()
                .show()
        }

    }
}

private fun Intent.putExtra(spiner1: spiner1.Companion, log1: String, name: String) {

}
