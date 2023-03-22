package com.example.mycounter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_add = findViewById<Button>(R.id.button)
        val btn_del = findViewById<Button>(R.id.button2)
        val btn_result = findViewById<Button>(R.id.button3)
        val textView = findViewById<TextView>(R.id.textView)
        val numInput = findViewById<EditText>(R.id.editTextNumber2)
        var timesclick = 0

        btn_add.setOnClickListener {
            if (numInput.text.toString().length !== 0) {
            var a = Integer.parseInt(numInput.text.toString())
            print(a)
            timesclick += a;
            textView.text = timesclick.toString();
            }
        }
        btn_del.setOnClickListener {
            if (numInput.text.toString().length !== 0) {
                var a = Integer.parseInt(numInput.text.toString())
                print(a)
                timesclick -= a;
                textView.text = timesclick.toString();
            }
        }
        btn_result.setOnClickListener {
            val intent = Intent(this@MainActivity, MainActivity2::class.java)
            intent.putExtra("gift", textView.text.toString())

            startActivity(intent)
        }
    }
}