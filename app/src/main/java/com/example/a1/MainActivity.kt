package com.example.a1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun infos(name:String,birth:Int?){
        textView.text = "İsminiz: $name Doğum yılınız : ${birth} "
        


    }
    fun show(view:View){
        var yourName = editTextTextPersonName.text.toString()
        var yourBirth = editTextNumber.text.toString().toIntOrNull()

        infos(yourName,yourBirth)
    }
}