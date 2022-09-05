package ghar.learning.di.dependency.nomudule

import javax.inject.Inject

class Building @Inject constructor() {

    fun injectRegisteredHouse(house: House){
        println("House Registered: $house")
    }

}
