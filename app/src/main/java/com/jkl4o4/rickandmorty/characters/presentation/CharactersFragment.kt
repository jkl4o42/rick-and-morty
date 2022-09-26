package com.jkl4o4.rickandmorty.characters.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.jkl4o4.rickandmorty.R
import com.jkl4o4.rickandmorty.details.presentaion.CharacterAdapter
import com.jkl4o4.rickandmorty.details.presentaion.DetailsFragment

class CharactersFragment : Fragment() {

    private val characterOnClickListener = object : CharacterAdapter.OnClickListener {
        override fun onClickListener(characterId: Int) {
            requireActivity().supportFragmentManager.beginTransaction()
                .add(R.id.container, DetailsFragment.newInstance(characterId))
                .addToBackStack(null)
                .commit()
        }
    }
    private val adapter = CharacterAdapter(characterOnClickListener)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_characters, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler)
        recyclerView.adapter = adapter
    }
}