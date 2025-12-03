package com.vacral.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.vacral.myapplication.databinding.ItemFilmBinding

class FilmAdapter(val filmList: List<FilmModel>): RecyclerView.Adapter<FilmAdapter.FilmViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FilmViewHolder {
        return FilmViewHolder(
            ItemFilmBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(
        holder: FilmViewHolder,
        position: Int
    ) {
        holder.onBind(filmModel = filmList[position])
    }

    override fun getItemCount(): Int = filmList.size


    class FilmViewHolder(private val binding: ItemFilmBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(filmModel: FilmModel) {
            binding.apply {
                tvName.text = filmModel.name
                tvRating.text = filmModel.rating
                Glide.with(imageFilm).load(filmModel.img).into(imageFilm);
            }

        }
    }
}
