package eu.parada.parking.model.api

import eu.parada.parking.model.Parking
import eu.parada.parking.model.User
import eu.parada.parking.model.api.service.CityService
import eu.parada.parking.model.api.service.CityServiceFirebase
import eu.parada.parking.model.api.service.UserService
import eu.parada.parking.model.api.service.UserServiceFirebase

object Repository {
    private val cityService: CityService = CityServiceFirebase()
    private val userService: UserService = UserServiceFirebase()

    fun getCurrentCityData(cityString: String){

    }

    fun getCurrentUserData(userId: String){

    }

    fun getCurrentParkingTicket(userId: String, ticketId: String) {

    }

    fun deleteCurrentUser(userId: String) {

    }

    fun changeUserData(userId: String, newData: User) {

    }

    fun createUser(user: User) {

    }

    fun buyTicket(userId: String, parking: Parking) {

    }
}