package edu.iesam.superhero.feature.list.domain

interface SuperheroRepository {
    fun obtainSuperheroes():List<Superhero>
}