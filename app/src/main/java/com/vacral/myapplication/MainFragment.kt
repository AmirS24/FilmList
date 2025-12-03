package com.vacral.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vacral.myapplication.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    // Безопасная работа с binding во фрагментах
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    private lateinit var adapter: FilmAdapter
    private var list = listOf<FilmModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // 1. Сначала загружаем данные
        loadData()
        // 2. Потом создаем адаптер с уже заполненным списком
        adapter = FilmAdapter(list)
        // 3. Устанавливаем адаптер
        binding.rvView.adapter = adapter
    }

    // Метод для загрузки данных
    private fun loadData() {
        list = listOf(
            FilmModel(
                name = "SpiderMan: Far From Home(2019)",
                rating = "4.6 (216)",
                img = "https://tse2.mm.bing.net/th/id/OIP.Jj5DwlSj6HMKM5WAYKZgXgHaLA?rs=1&pid=ImgDetMain&o=7&rm=3"
            ),
            FilmModel(
                name = "Archer(2017)",
                rating = "3.6 (196)",
                img = "https://th.bing.com/th/id/OIP.56Y2D1fxjUkQYyaa_NaE2QHaJ4?w=128&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3"
            ),
            FilmModel(
                name = "FreeDoom(2020)",
                rating = "4.8 (296)",
                img = "https://th.bing.com/th/id/OIP.tmbMw1JoePyDMHWJfy_H4gHaK-?w=125&h=186&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3"
            ),
            FilmModel(
                name = "Один дома(Новый год)",
                rating = "5.0 (496)",
                img = "https://th.bing.com/th/id/OIP.Dpy9ScIbov6pJUHSqkEldQAAAA?w=121&h=182&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3"
            ),
            FilmModel(
                name = "SpiderMan: Far From Home(2019)",
                rating = "4.6 (216)",
                img = "https://tse2.mm.bing.net/th/id/OIP.Jj5DwlSj6HMKM5WAYKZgXgHaLA?rs=1&pid=ImgDetMain&o=7&rm=3"
            ),
            FilmModel(
                name = "Archer(2017)",
                rating = "3.6 (196)",
                img = "https://th.bing.com/th/id/OIP.56Y2D1fxjUkQYyaa_NaE2QHaJ4?w=128&h=180&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3"
            ),
            FilmModel(
                name = "FreeDoom(2020)",
                rating = "4.8 (296)",
                img = "https://th.bing.com/th/id/OIP.tmbMw1JoePyDMHWJfy_H4gHaK-?w=125&h=186&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3"
            ),
            FilmModel(
                name = "Один дома(Новый год)",
                rating = "5.0 (496)",
                img = "https://th.bing.com/th/id/OIP.Dpy9ScIbov6pJUHSqkEldQAAAA?w=121&h=182&c=7&r=0&o=7&dpr=1.3&pid=1.7&rm=3"
            )
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Очищаем binding, чтобы избежать утечек памяти
        _binding = null
    }
}