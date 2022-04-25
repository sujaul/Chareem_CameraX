package com.chareem.customcamerax

import android.app.Activity
import android.content.Intent
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
            .setFaceDetection(true)
            .setImageName("imageku")
            .setMockDetection(true)
            .setTimeStamp(true)
            .launchCamera()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if ((requestCode == CameraHelper.RESULT_CODE) && resultCode == Activity.RESULT_OK){
            val filePath:String = data?.getStringExtra(CameraHelper.RESULT_PATH) ?: ""
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}