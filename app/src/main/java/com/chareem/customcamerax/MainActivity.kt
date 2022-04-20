package com.chareem.customcamerax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.example.cameraxbasic.ChareemCameraX
import com.android.example.cameraxbasic.utils.CameraHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ChareemCameraX.with(this)
            .setCameraFacing(CameraHelper.FACING_BACK)
            .setFaceDetection(false)
            .setImageName("imageku")
            .setMockDetection(true)
            .setTimeStamp(true)
            .launchCamera()
        finish()
    }
}