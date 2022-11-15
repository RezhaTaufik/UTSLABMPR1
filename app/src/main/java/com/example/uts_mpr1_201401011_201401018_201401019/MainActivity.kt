package com.example.uts_mpr1_201401011_201401018_201401019

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.uts_mpr1_201401011_201401018_201401019.databinding.ActivityAppBarBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAppBarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





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

