package eu.parada.parking.model

import java.util.*

data class User (
    val id: String,
    val parkingPlates: List<ParkingPlate>,
    val history: List<Parking>
)