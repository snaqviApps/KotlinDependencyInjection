package ghar.learning.di.dependency

import ghar.learning.di.dependency.nomudule.Building
import ghar.learning.di.dependency.nomudule.House
import javax.inject.Inject

/**  This class can help 'Building-interface' in class:House to be passed itself
 * as 'argument in method: helloRegisteredHouse()' instead of Buildings interface,
 * since Building: being "Interface" won't hve "Constructor"
 *
 * This is achieved using Dagger-annotation called 'Binds' that are abstract methods on modules
 *
 * */
class Bungalow @Inject constructor() : Building {

    override fun injectRegisteredHouse(house: House) {
        println("House registerd as Bungalow: $house")
    }
}