package com.gmail.apigeoneer.textrecognitiondemo

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.gmail.apigeoneer.textrecognitiondemo.databinding.ActivityScanningBinding

class ScanningActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScanningBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_scanning)

        binding.apply {
            takeAPicButton.setOnClickListener {
                if (checkPermissions()) {
                    takeAPicture()
                } else {
                    requestPermission()
                }
            }

            detectNowTextView.setOnClickListener {
                detectText()
            }
        }

    }

    private fun checkPermissions(): Boolean {
        val cameraPermission = ContextCompat.checkSelfPermission(applicationContext, CAMERA_SERVICE)

        return (cameraPermission == PackageManager.PERMISSION_GRANTED)
    }

    private fun takeAPicture() {

    }

    private fun requestPermission() {

    }

    private fun detectText() {

    }
}