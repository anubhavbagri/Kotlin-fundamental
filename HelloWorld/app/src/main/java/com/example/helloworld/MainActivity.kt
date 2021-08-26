package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var personName : EditText
    lateinit var viewName : Button
    lateinit var showName : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewName = findViewById(R.id.viewName)  //find the view in the layout with the id
    }

    fun showName(view: View){
        personName = findViewById(R.id.personName)
        showName = findViewById(R.id.showName)

        var name = personName.text
        showName.setText(name)

     }

}