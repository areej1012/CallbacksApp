package com.example.callbacksapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this,"Activity1 onCreate Called",Toast.LENGTH_SHORT).show()
        Log.i("Activity1","onCreate Called")
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"Activity1 onStart Called",Toast.LENGTH_SHORT).show()
        Log.i("Activity1","onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"Activity1 onResume Called",Toast.LENGTH_SHORT).show()
        Log.i("Activity1","onResume Called")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"Activity1 onRestart Called",Toast.LENGTH_SHORT).show()
        Log.i("Activity1","onRestart Called")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"Activity1 onPause Called",Toast.LENGTH_SHORT).show()
        Log.i("Activity1","onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"Activity1 onStop Called",Toast.LENGTH_SHORT).show()
        Log.i("Activity1","onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"Activity1 onDestroy Called",Toast.LENGTH_SHORT).show()
        Log.i("Activity1","onDestroy Called")
    }

    fun MoveTo2A(view: View) {
        startActivity(Intent(this,MainActivity2::class.java))
    }
}