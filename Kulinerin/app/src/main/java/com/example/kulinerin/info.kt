package com.example.kulinerin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.kulinerin.databinding.ActivityInfoBinding

class info : AppCompatActivity() {
    private lateinit var binding: ActivityInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        binding = ActivityInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bthome.setOnClickListener{
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }
    }


    //fun backHome(view: View) {}
    //val intent = Intent(this@info, MainActivity::class.java)
    //startActivity()
}