package com.example.kulinerin

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import androidx.appcompat.app.AppCompatActivity
import com.example.kulinerin.databinding.ActivityFoodDetailBinding



class FoodDetail : AppCompatActivity() {

    companion object{
        const val EXTRA_USER = "DATA"
    }
    private lateinit var binding : ActivityFoodDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getDataUser : Food = intent.getParcelableExtra<Food>(EXTRA_USER) as Food
        binding.apply {
            tvName.text = getDataUser.name
            tvUsername.text = getDataUser.lokasi
            imageView.setImageResource(getDataUser.photo)
            tvResep.text = getDataUser.resep








        }
    }
}