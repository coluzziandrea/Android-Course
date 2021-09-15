package it.coluzzi.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView)
        var counter = 0
        btnClick.setOnClickListener {
            counter++
            textView.text = counter.toString()
            Toast.makeText(this@MainActivity, "You clicked me!",Toast.LENGTH_SHORT)
        }
    }
}