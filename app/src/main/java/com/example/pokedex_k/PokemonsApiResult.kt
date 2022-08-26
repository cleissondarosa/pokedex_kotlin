package com.example.pokedex_k

import android.telephony.mbms.StreamingServiceInfo

data class PokemonsApiResult(

    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<PokemonResult>

)


data class PokemonResult(
    val name: String,
    val url: String
)

data class PokemonApiResult(
    val id: String,
    val name: String,
    val types: List<PokemonTypeSlot>
)

data class PokemonTypeSlot(
    val slot: Int,
    val type: PokemonType
)
