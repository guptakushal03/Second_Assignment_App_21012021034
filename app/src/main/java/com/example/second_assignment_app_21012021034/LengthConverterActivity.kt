package com.example.second_assignment_app_21012021034

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LengthConverterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_length_converter)

        val convert = findViewById<Button>(R.id.convertBtn)
        val dataValue:EditText = findViewById<EditText>(R.id.DataValue)
        val tempStr = dataValue.text.toString()
        val tempInt: Int = tempStr.toInt()

        convert.setOnClickListener(){
            convertLength(tempInt)
        }

    }

    fun convertLength(tempInt: Int){
        var b = tempInt/1000
        var c = tempInt/1609
        var d = tempInt*39.37

        findViewById<TextView>(R.id.KgsValue).text = b.toString()
        findViewById<TextView>(R.id.MilesValue).text = c.toString()
        findViewById<TextView>(R.id.InchesValue).text = d.toString()
    }
}