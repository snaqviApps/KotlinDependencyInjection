package ghar.learning.di.dependency.model

import javax.inject.Inject
import javax.inject.Named


/**
 * demonstrates member injection method (class instance that has constructor with no 'inject'
 * annotation so Dagger is not responsible for creating that
 */
class Car {

    @Inject
    @Named("carName")
    lateinit var name : String

    fun getCarName() {
        println("Hello $name")
    }
}