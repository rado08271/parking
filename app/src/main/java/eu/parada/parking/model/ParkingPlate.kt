package eu.parada.parking.model

data class ParkingPlate (
    val plate: String,
    val active: Boolean,
    val inUser: Boolean
)