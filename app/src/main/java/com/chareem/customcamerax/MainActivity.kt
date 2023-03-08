package com.chareem.customcamerax

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.chareem.camerax.cameraxbasic.ChareemCameraX
import com.chareem.camerax.cameraxbasic.utils.CameraHelper

class MainActivity : AppCompatActivity() {
    private val resCode = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ChareemCameraX.with(this)
            .setCameraFacing(CameraHelper.FACING_BACK)
            .setFaceDetection(false)
            .setImageName("imageku")
            .setMockDetection(false)
            .setTimeStamp(true)
            .setResultCode(resCode)
            .setDirectoryName("apa/picture")
            .launchCamera()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if ((requestCode == resCode) && resultCode == Activity.RESULT_OK){
            val filePath:String = data?.getStringExtra(CameraHelper.RESULT_PATH) ?: ""
            Log.d("resss", filePath)
        }
        super.onActivityResult(requestCode, resultCode, data)
    }
}