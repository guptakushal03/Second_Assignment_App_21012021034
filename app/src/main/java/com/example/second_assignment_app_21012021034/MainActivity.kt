package com.example.second_assignment_app_21012021034

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lengthBtn = findViewById<Button>(R.id.LengthBtn)
        val weightBtn = findViewById<Button>(R.id.WeightBtn)
        val tempBtn = findViewById<Button>(R.id.TempBtn)
        val dataBtn = findViewById<Button>(R.id.DataBtn)

        lengthBtn.setOnClickListener(){
            Intent(this@MainActivity, LengthConverterActivity::class.java).also { startActivity(it) }
        }

        weightBtn.setOnClickListener(){
            Intent(this@MainActivity, WeightConverterActivity::class.java).also { startActivity(it) }
        }

        tempBtn.setOnClickListener(){
            Intent(this@MainActivity, TempConverterActivity::class.java).also { startActivity(it) }
        }

        dataBtn.setOnClickListener(){
            Intent(this@MainActivity, DataConverterActivity::class.java).also { startActivity(it) }
        }

    }
}