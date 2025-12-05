package com.vacral.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.vacral.myapplication.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {
private lateinit var binding: FragmentDetailBinding
private val navArgs: DetailFragmentArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding = FragmentDetailBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navArgs.filmModel?.let {filmModel->

            binding.fragmentImg.loadImg(filmModel.img)
            binding.tvName.text = filmModel.name
        }
    }
    }
