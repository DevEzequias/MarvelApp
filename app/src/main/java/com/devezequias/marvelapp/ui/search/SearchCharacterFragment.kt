package com.devezequias.marvelapp.ui.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.devezequias.marvelapp.databinding.FragmentSearchCharacterBinding
import com.devezequias.marvelapp.ui.base.BaseFragment

class SearchCharacterFragment : BaseFragment<FragmentSearchCharacterBinding, SearchCharacterViewModel>()  {

    override val viewModel: SearchCharacterViewModel by viewModels()

    override fun getViewBinging(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentSearchCharacterBinding =
        FragmentSearchCharacterBinding.inflate(inflater, container, false)
}