package com.devezequias.marvelapp.ui.favorite

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.devezequias.marvelapp.databinding.FragmentFavoriteCharacterBinding
import com.devezequias.marvelapp.ui.base.BaseFragment

class FavoriteCharacterFragment : BaseFragment<FragmentFavoriteCharacterBinding, FavoriteCharacterViewModel>() {

    override val viewModel: FavoriteCharacterViewModel by viewModels()

    override fun getViewBinging(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentFavoriteCharacterBinding =
        FragmentFavoriteCharacterBinding.inflate(inflater, container, false)
}