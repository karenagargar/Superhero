package edu.iesam.superhero.feature.list.data.local

import edu.iesam.superhero.feature.list.domain.Superhero

class SuperheroMemLocalDataSource {
    val superheroes=listOf<Superhero>(
        Superhero("1","A-Bomb","1-a-bomb","https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/1-a-bomb.jpg"),
        Superhero("2","Abe Sapien","2-abe-sapien","https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/2-abe-sapien.jpg"),
        Superhero("3","Abin Sur","3-abin-sur","https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/3-abin-sur.jpg"),
        Superhero("4","Abomination","4-abomination","https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/4-abomination.jpg"),
        Superhero("5","Abraxas","5-abraxas","https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/5-abraxas.jpg"),
        Superhero("6","Absorbing Man","6-absorbing-man","https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/6-absorbing-man.jpg"),
        Superhero("7","Adam Monroe","7-adam-monroe","https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/7-adam-monroe.jpg"),
        Superhero("8","Adam Strange","8-adam-strange","https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/8-adam-strange.jpg"),
        Superhero("9","Agent 13","9-agent-13","https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/9-agent-13.jpg"),
        Superhero("10","Agent Bob","10-agent-bob","https://cdn.jsdelivr.net/gh/akabab/superhero-api@0.3.0/api/images/lg/10-agent-bob.jpg")
    )
    fun getAll() = superheroes
}