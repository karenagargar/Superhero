package edu.iesam.superhero.feature.list.domain

class GetSuperheroesUseCase(private val superheroRepository: SuperheroRepository) {
    operator fun invoke(): List<Superhero>{
        return superheroRepository.obtainSuperheroes()
    }
}