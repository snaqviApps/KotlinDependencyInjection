package ghar.learning.di

import ghar.learning.di.dependency.DaggerAppGraph
import ghar.learning.di.dependency.model.Car


fun main() {

    val car = Car()

    val graph = DaggerAppGraph.create()
    val house = graph.injectHouse()

    /** Member-injection-method */
    graph.injectCar(car)

    house.greetingsLandLord()
    car.getCarName()

}

