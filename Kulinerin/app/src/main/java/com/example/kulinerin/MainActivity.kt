package com.example.kulinerin


import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.content.res.Configuration
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kulinerin.FoodDetail.Companion.EXTRA_USER
import com.example.kulinerin.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_USER = "DATA"
        private val REQUIRED_PERMISSIONS = arrayOf(Manifest.permission.CAMERA)
        private const val REQUEST_CODE_PERMISSIONS = 10
    }
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_CODE_PERMISSIONS) {
            if (!allPermissionsGranted()) {
                Toast.makeText(
                    this,
                    "Tidak mendapatkan permission.",
                    Toast.LENGTH_SHORT
                ).show()
                finish()
            }
        }
    }
    private fun allPermissionsGranted() = REQUIRED_PERMISSIONS.all {
        ContextCompat.checkSelfPermission(baseContext, it) == PackageManager.PERMISSION_GRANTED
    }

    private lateinit var rvUser: RecyclerView
    private val list = ArrayList<Food>()
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (!allPermissionsGranted()) {
            ActivityCompat.requestPermissions(
                this,
                REQUIRED_PERMISSIONS,
                REQUEST_CODE_PERMISSIONS
            )
        }

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        rvUser = findViewById(R.id.list_user)
        rvUser.setHasFixedSize(true)

        list.addAll(listFoods)
        showRecycleList()
    }
    private val listFoods : ArrayList<Food>

        get() {
            val dataName = resources.getStringArray(R.array.name)
          val dataUsername = resources.getStringArray(R.array.lokasi)
          val dataPhoto = resources.obtainTypedArray(R.array.avatar)
            val dataResep =  resources.getStringArray(R.array.resep)


          val listFood = ArrayList<Food>()
          for (i in dataName.indices){
              val users = Food(
                      dataName[i], dataUsername[i], dataPhoto.getResourceId(i, -1), dataResep[i],
              )
              listFood.add(users)
          }
            return listFood
        }



    private fun showRecycleList(){
        if (applicationContext.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            rvUser.layoutManager = GridLayoutManager(this, 2)
        } else {
            rvUser.layoutManager = LinearLayoutManager(this)
        }
        rvUser.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListFoodAdapter(list)
        rvUser.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : ListFoodAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Food) {
                val moveDetailUser = Intent(this@MainActivity, FoodDetail::class.java)
                moveDetailUser.putExtra(EXTRA_USER, data)
                startActivity(moveDetailUser)
            }
        })
 }

    fun detailBerita(view: View) {
        val intent = Intent(this@MainActivity, berita::class.java)
        startActivity(intent)

    }

    fun infoApp(view: View) {
        val intent = Intent(this@MainActivity, info::class.java)
        startActivity(intent)
    }

    fun goCamera(view: View) {
        val intent = Intent(this@MainActivity, camera::class.java)
        startActivity(intent)

    }
}