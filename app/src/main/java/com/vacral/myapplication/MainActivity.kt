package com.vacral.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.vacral.myapplication.databinding.ActivityMainBinding
import kotlinx.coroutines.android.awaitFrame

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: FilmAdapter
    private var list = listOf<FilmModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        loadData()

        adapter = FilmAdapter(list)
        binding.rvView.adapter = adapter
    }
        fun loadData(){
list = listOf(
    FilmModel(name = "SpiderMan: Far From Home(2019)", rating = "4.6 (216)", img = "https://tse2.mm.bing.net/th/id/OIP.Jj5DwlSj6HMKM5WAYKZgXgHaLA?rs=1&pid=ImgDetMain&o=7&rm=3")
    ,
    FilmModel(name = "Archer(2017)", rating = "3.6 (196)", img = "https://th.bing.com/th/id/OIP.56Y2D1fxjUkQYyaa_NaE2QHaJ4?w=128&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3")
    ,
    FilmModel(name = "FreeDoom(2020)", rating = "4.8 (296)", img = "https://th.bing.com/th/id/OIP.tmbMw1JoePyDMHWJfy_H4gHaK-?w=125&h=186&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3")
    ,
    FilmModel(name = "Один дома(Новый год)", rating = "5.0 (496)", img = "https://th.bing.com/th/id/OIP.Dpy9ScIbov6pJUHSqkEldQAAAA?w=121&h=182&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3")
            ,
    FilmModel(name = "SpiderMan: Far From Home(2019)", rating = "4.6 (216)", img = "https://tse2.mm.bing.net/th/id/OIP.Jj5DwlSj6HMKM5WAYKZgXgHaLA?rs=1&pid=ImgDetMain&o=7&rm=3")
    ,
    FilmModel(name = "Archer(2017)", rating = "3.6 (196)", img = "https://th.bing.com/th/id/OIP.56Y2D1fxjUkQYyaa_NaE2QHaJ4?w=128&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3")
    ,
    FilmModel(name = "FreeDoom(2020)", rating = "4.8 (296)", img = "https://th.bing.com/th/id/OIP.tmbMw1JoePyDMHWJfy_H4gHaK-?w=125&h=186&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3")
    ,
    FilmModel(name = "Один дома(Новый год)", rating = "5.0 (496)", img = "https://th.bing.com/th/id/OIP.Dpy9ScIbov6pJUHSqkEldQAAAA?w=121&h=182&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3")

    ,
            )
        }
    }
