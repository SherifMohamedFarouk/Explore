package com.sherif.nearbyplaces.model.place

data class Location(
    val address: String,
    val city: String,
    val country: String,
    val crossStreet: String,
    val state: String
)