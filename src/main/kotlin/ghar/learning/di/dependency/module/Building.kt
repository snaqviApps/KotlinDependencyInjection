package ghar.learning.di.dependency.module

import javax.inject.Inject

class Building @Inject constructor() {

    fun injectRegisteredHouse(house: House){
        println("House Registered: $house")
    }

}
