package com.jkl4o4.rickandmorty.main.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jkl4o4.rickandmorty.R
import com.jkl4o4.rickandmorty.characters.presentation.CharactersFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.container, CharactersFragment())
            .commit()
    }
}