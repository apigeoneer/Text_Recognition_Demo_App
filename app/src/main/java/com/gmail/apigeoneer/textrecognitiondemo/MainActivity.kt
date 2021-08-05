package com.gmail.apigeoneer.textrecognitiondemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.gmail.apigeoneer.textrecognitiondemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        navigateToScanningActivity()
    }

    private fun navigateToScanningActivity() {
        binding.getstartedButton.setOnClickListener {
            val intent = Intent(this, ScanningActivity::class.java)
            startActivity(intent)
        }
    }


}