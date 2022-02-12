package com.devezequias.marvelapp.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.devezequias.marvelapp.databinding.FragmentListCharacterBinding
import com.devezequias.marvelapp.ui.base.BaseFragment

class ListCharacterFragment : BaseFragment<FragmentListCharacterBinding, ListCharacterViewModel>() {

    override val viewModel: ListCharacterViewModel by viewModels()

    override fun getViewBinging(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ): FragmentListCharacterBinding =
        FragmentListCharacterBinding.inflate(inflater, container, false)
}