package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val click = findViewById<Button>(R.id.button) as Button
        val checkOne = findViewById<CheckBox>(R.id.kotlin) as CheckBox
        val checkTwo = findViewById<CheckBox>(R.id.java) as CheckBox

        click.setOnClickListener {
            if (checkOne.isChecked == true && checkTwo.isChecked == true) {
                Toast.makeText(this@MainActivity,"Kotlin + Java",Toast.LENGTH_SHORT).show()
            }
            else if(checkTwo.isChecked == true) {
              Toast.makeText(this@MainActivity,"Java",Toast.LENGTH_SHORT).show()
            }
            else if(checkOne.isChecked) {
                Toast.makeText(this@MainActivity,"Kotlin",Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this@MainActivity,"Nothing Selected",Toast.LENGTH_SHORT).show()
        }
        }
    }
}


