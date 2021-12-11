package com.example.callbacksapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Toast.makeText(this,"Activity2 onCreate Called", Toast.LENGTH_SHORT).show()
        Log.i("Activity2","onCreate Called")
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"Activity2 onStart Called", Toast.LENGTH_SHORT).show()
        Log.i("Activity2","onStart Called")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"Activity2 onResume Called", Toast.LENGTH_SHORT).show()
        Log.i("Activity2","onResume Called")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"Activity2 onRestart Called", Toast.LENGTH_SHORT).show()
        Log.i("Activity2","onRestart Called")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"Activity2 onPause Called", Toast.LENGTH_SHORT).show()
        Log.i("Activity2","onPause Called")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this,"Activity2 onStop Called", Toast.LENGTH_SHORT).show()
        Log.i("Activity2","onStop Called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"Activity2 onDestroy Called", Toast.LENGTH_SHORT).show()
        Log.i("Activity2","onDestroy Called")
    }
}