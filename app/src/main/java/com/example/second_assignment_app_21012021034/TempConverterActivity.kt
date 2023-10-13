package com.example.second_assignment_app_21012021034

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class TempConverterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temp_converter)

        val convert = findViewById<Button>(R.id.convertBtn)
        convert.setOnClickListener() {
            val dataValue: EditText = findViewById<EditText>(R.id.DataValue)
            val tempStr = dataValue.text.toString()
            try {
                val tempInt: Int = tempStr.toInt()

                var b = tempInt * 9/5 + 32
                var c = tempInt + 273.15
                var d = tempInt * 9.0 / 5.0 + 491.67
                val newD = String.format("%.5f", d)

                findViewById<TextView>(R.id.FahValue).text = b.toString()
                findViewById<TextView>(R.id.KelvinValue).text = c.toString()
                findViewById<TextView>(R.id.RankineValue).text = newD

            } catch (e: NumberFormatException) {
                Log.e("TempConverterActivity", "Conversion error: ${e.message}")
            }
        }

        val clearBtn = findViewById<Button>(R.id.ClearBtn)
        clearBtn.setOnClickListener() {
            findViewById<EditText>(R.id.DataValue).text.clear()
            findViewById<TextView>(R.id.FahValue).text = ""
            findViewById<TextView>(R.id.KelvinValue).text = ""
            findViewById<TextView>(R.id.RankineValue).text = ""
        }

        val gobackBtn = findViewById<Button>(R.id.gobackBtn)
        gobackBtn.setOnClickListener() {
            Intent(this@TempConverterActivity, MainActivity::class.java).also { startActivity(it) }
        }
    }
}