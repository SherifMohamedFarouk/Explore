package com.sherif.nearbyplaces.model.place

import com.sherif.nearbyplaces.model.place.Location

data class Venue(
    val id: String,
    val location: Location,
    val name: String

)