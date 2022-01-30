package com.example.tugasapipokemon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasapipokemon.api.ApiConfig
import com.example.tugasapipokemon.model.ResponsePokemon
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvBlog = findViewById<RecyclerView>(R.id.rv_blog)

        ApiConfig.getService().getPokemon().enqueue(object : Callback<ResponsePokemon> {
            override fun onResponse(call: Call<ResponsePokemon>, response: Response<ResponsePokemon>) {
                if (response.isSuccessful){
                    val responsePokemon = response.body()
                    val dataGame = responsePokemon?.data
                    val PokemonAdapter = PokemonAdapter(dataGame)
                    rvBlog.apply {
                        layoutManager = LinearLayoutManager(this@MainActivity)
                        setHasFixedSize(true)
                        PokemonAdapter.notifyDataSetChanged()
                        adapter = PokemonAdapter
                    }

                }
            }

            override fun onFailure(call: Call<ResponsePokemon>, t: Throwable) {
                Log.d("MainActivity", "error di" + t.localizedMessage)
                Toast.makeText(this@MainActivity, t.localizedMessage, Toast.LENGTH_SHORT).show()
            }
        })
    }
}