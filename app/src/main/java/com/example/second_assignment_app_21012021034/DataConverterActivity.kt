package com.example.second_assignment_app_21012021034

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class DataConverterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_converter)

        val convert = findViewById<Button>(R.id.convertBtn)
        convert.setOnClickListener() {
            val dataValue: EditText = findViewById<EditText>(R.id.DataValue)
            val tempStr = dataValue.text.toString()
            try {
                val tempInt: Int = tempStr.toInt()

                var b = tempInt * 1000
                var c = tempInt / 1000.0
                val newC = String.format("%.3f", c)

                findViewById<TextView>(R.id.MBsValue).text = b.toString()
                findViewById<TextView>(R.id.TBsValue).text = newC

            } catch (e: NumberFormatException) {}
        }

        val clearBtn = findViewById<Button>(R.id.ClearBtn)
        clearBtn.setOnClickListener(){
            findViewById<EditText>(R.id.DataValue).text.clear()
            findViewById<TextView>(R.id.MBsValue).text = ""
            findViewById<TextView>(R.id.TBsValue).text = ""
        }

        val gobackBtn = findViewById<Button>(R.id.gobackBtn)
        gobackBtn.setOnClickListener(){
            Intent(this@DataConverterActivity, MainActivity::class.java).also { startActivity(it) }
        }
    }
}