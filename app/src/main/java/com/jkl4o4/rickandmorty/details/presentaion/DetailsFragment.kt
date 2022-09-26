package com.jkl4o4.rickandmorty.details.presentaion

import android.os.Bundle
import android.transition.TransitionInflater
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.jkl4o4.rickandmorty.R

class DetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }


    companion object {

        private const val CHARACTER_ID = "id"

        fun newInstance(characterId: Int) = DialogFragment().apply {
            arguments = Bundle().apply {
                putInt(CHARACTER_ID, characterId)
            }
        }
    }
}