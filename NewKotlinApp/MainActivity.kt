package com.example.newkotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.view.View
//import android.widget.Button
//import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*   //synthetic means something that does not exist when this app is actually
// going to run

// : -> extends
// () -> empty constructor
class MainActivity : AppCompatActivity() {

//    var btnAdd : Button? = null
    override fun onCreate(savedInstanceState: Bundle?) //? means that the value can be null
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var btnAdd : Button = findViewById(R.id.btnAdd)      //variable btnAdd is of type Button
        //var btnAdd = findViewById<Button>(R.id.btnAdd)

        //btnAdd -> (findViewById<Button>(R.id.btnAdd))
        btnAdd.setOnClickListener {
            //the code we write here is going to be the body of the onClickListener
//            Toast.makeText(this@MainActivity, "Hello!", Toast.LENGTH_SHORT).show()
            val result = etVar1.text.toString().toInt() + etVar2.text.toString().toInt()
            tvResult.text = result.toString()
        }
    }

}