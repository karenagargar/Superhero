package edu.iesam.superhero.feature.list.presentation

import androidx.lifecycle.ViewModel
import edu.iesam.superhero.feature.list.domain.GetSuperheroesUseCase

class SuperheroListViewModel (private val getSuperheroesUseCase: GetSuperheroesUseCase): ViewModel() {
    fun getSuperheroes()= getSuperheroesUseCase()
}