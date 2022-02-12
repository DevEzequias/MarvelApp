package com.devezequias.marvelapp.ui.details

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.devezequias.marvelapp.databinding.FragmentDetailsCharacterBinding
import com.devezequias.marvelapp.ui.base.BaseFragment

class DetailsCharacterFragment : BaseFragment<FragmentDetailsCharacterBinding, DetailsCharacterViewModel>() {
    override val viewModel: DetailsCharacterViewModel by viewModels()

    override fun getViewBinging(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentDetailsCharacterBinding =
        FragmentDetailsCharacterBinding.inflate(inflater, container, false)
}