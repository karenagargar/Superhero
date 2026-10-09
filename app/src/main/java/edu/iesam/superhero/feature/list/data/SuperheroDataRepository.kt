package edu.iesam.superhero.feature.list.data

import edu.iesam.superhero.feature.list.data.local.SuperheroMemLocalDataSource
import edu.iesam.superhero.feature.list.data.remote.SuperheroMemRemoteDataSource
import edu.iesam.superhero.feature.list.domain.Superhero
import edu.iesam.superhero.feature.list.domain.SuperheroRepository

class SuperheroDataRepository(private val localDataSource: SuperheroMemLocalDataSource) : SuperheroRepository {

    override fun obtainSuperheroes(): List<Superhero> {
        return localDataSource.getAll()
    }

}