package com.example.uts_mpr1_201401011_201401018_201401019

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.uts_mpr1_201401011_201401018_201401019.databinding.ActivityAppBarBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAppBarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "LOGIN"





    }


    fun onClick(view: View){
        when(view.id){
            R.id.button3 ->{
                val intent = Intent(this@MainActivity, DetailActivity ::class.java)
                startActivity(intent)
            }
        }

    }
}

