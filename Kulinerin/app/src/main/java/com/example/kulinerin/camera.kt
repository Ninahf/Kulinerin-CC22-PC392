
package com.example.kulinerin

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.Toast
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageCapture
import androidx.camera.core.ImageCaptureException
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.core.content.ContextCompat
import com.example.kulinerin.databinding.ActivityCameraBinding


class camera : AppCompatActivity() {


    private lateinit var binding: ActivityCameraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera)
        binding = ActivityCameraBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.captureImage.setOnClickListener { takePhoto() }
        binding.switchCamera.setOnClickListener { startCamera() }
        binding.switchCamera.setOnClickListener {
            cameraSelector = if (cameraSelector.equals(CameraSelector.DEFAULT_BACK_CAMERA)) CameraSelector.DEFAULT_FRONT_CAMERA
            else CameraSelector.DEFAULT_BACK_CAMERA

            startCamera()
        }


        }
    private var imageCapture: ImageCapture? = null
    private var cameraSelector: CameraSelector = CameraSelector.DEFAULT_BACK_CAMERA

    fun startCamera() {


        val cameraProviderFuture = ProcessCameraProvider.getInstance(this)

        cameraProviderFuture.addListener({
            val cameraProvider: ProcessCameraProvider = cameraProviderFuture.get()
            val preview = Preview.Builder()
                .build()
                .also {
                    it.setSurfaceProvider(binding.viewFinder.surfaceProvider)
                }

            imageCapture = ImageCapture.Builder().build()

            try {
                cameraProvider.unbindAll()
                cameraProvider.bindToLifecycle(
                    this,
                    cameraSelector,
                    preview,
                    imageCapture
                )
            } catch (exc: Exception) {
                Toast.makeText(
                    this@camera,
                    "Gagal memunculkan kamera.",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }, ContextCompat.getMainExecutor(this))
    }
    private fun takePhoto() {
        val imageCapture = imageCapture ?: return
        val photoFile = createFile(application)
        val outputOptions = ImageCapture.OutputFileOptions.Builder(photoFile).build()
        imageCapture.takePicture(
            outputOptions,
            ContextCompat.getMainExecutor(this),
            object : ImageCapture.OnImageSavedCallback {
                override fun onError(exc: ImageCaptureException) {
                    Toast.makeText(
                        this@camera,
                        "Gagal mengambil gambar.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
                override fun onImageSaved(output: ImageCapture.OutputFileResults) {
                    Toast.makeText(
                        this@camera,
                        "Berhasil mengambil gambar.",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        )
    }


    fun imgResult(view: View) {
        val intent = Intent(this@camera, resultActivity::class.java)
        startActivity(intent)
    }
}