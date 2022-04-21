package com.chareem.customcamerax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.chareem.camerax.cameraxbasic.ChareemCameraX
import com.chareem.camerax.cameraxbasic.utils.CameraHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ChareemCameraX.with(this)
            .setCameraFacing(CameraHelper.FACING_FRONT)
            .setFaceDetection(false)
            .setImageName("imageku")
            .setMockDetection(true)
            .setTimeStamp(true)
            .launchCamera()
        finish()
    }
}