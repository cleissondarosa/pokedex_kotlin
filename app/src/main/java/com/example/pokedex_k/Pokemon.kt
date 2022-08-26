package com.example.pokedex_k

data class Pokemon(

    val number: String,
    val name: String,
    val types: List<PokemonType>
) {

    val formattedName = name.capitalize()
    val formattedNumber = number.toString().padStart(3, '0')

    val imageUrl by lazy { "https://assets.pokemon.com/assets/cms2/img/pokedex/detail/$formattedNumber.png" }
}
