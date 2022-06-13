package com.example.kulinerin

import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts

import com.example.kulinerin.databinding.ActivityCameraBinding
import com.example.kulinerin.databinding.ActivityHasilFotoBinding
import java.io.File

class hasilFoto : AppCompatActivity() {
    private lateinit var binding: ActivityHasilFotoBinding
    companion object {
        const val CAMERA_X_RESULT = 200
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasil_foto)


    }
    private val launcherIntentCameraX = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) {
        if (it.resultCode == CAMERA_X_RESULT) {
            val myFile = it.data?.getSerializableExtra("picture") as File
            val isBackCamera = it.data?.getBooleanExtra("isBackCamera", true) as Boolean
            val result = BitmapFactory.decodeFile(myFile.path)

            binding.imageView5.setImageBitmap(result)
        }
    }

    fun goCamera(view: View) {
        val intent = Intent(this, camera::class.java)
        launcherIntentCameraX.launch(intent)

    }

}