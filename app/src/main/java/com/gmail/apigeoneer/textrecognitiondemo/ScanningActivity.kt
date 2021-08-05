package com.gmail.apigeoneer.textrecognitiondemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.gmail.apigeoneer.textrecognitiondemo.databinding.ActivityScanningBinding

class ScanningActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScanningBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_scanning)
    }
}