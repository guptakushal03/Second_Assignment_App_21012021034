package com.example.second_assignment_app_21012021034

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class WeightConverterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weight_converter)

        val convert = findViewById<Button>(R.id.convertBtn)
        convert.setOnClickListener() {
            val dataValue: EditText = findViewById<EditText>(R.id.DataValue)
            val tempStr = dataValue.text.toString()
            try {
                val tempInt: Int = tempStr.toInt()

                var b = tempInt * 1000
                var c = tempInt * 2.205
                val newC = String.format("%.5f", c)
                var d = tempInt * 35.274
                val newD = String.format("%.5f", d)

                findViewById<TextView>(R.id.GramsValue).text = b.toString()
                findViewById<TextView>(R.id.PoundsValue).text = newC
                findViewById<TextView>(R.id.OuncesValue).text = newD

            } catch (e: NumberFormatException) {}
        }

        val clearBtn = findViewById<Button>(R.id.ClearBtn)
        clearBtn.setOnClickListener(){
            findViewById<EditText>(R.id.DataValue).text.clear()
            findViewById<TextView>(R.id.GramsValue).text = ""
            findViewById<TextView>(R.id.PoundsValue).text = ""
            findViewById<TextView>(R.id.OuncesValue).text = ""
        }

        val gobackBtn = findViewById<Button>(R.id.gobackBtn)
        gobackBtn.setOnClickListener(){
            Intent(this@WeightConverterActivity, MainActivity::class.java).also { startActivity(it) }
        }
    }
}