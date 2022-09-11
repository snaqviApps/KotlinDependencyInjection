package ghar.learning.di

import ghar.learning.di.dependency.DaggerAppGraph
import ghar.learning.di.dependency.model.Person


fun main() {

    /** instantiate Dependency-GRAPH */
    val graph = DaggerAppGraph.create()
    val house = graph.injectHouse()
    house.greetingsLandLord(Person(26, "Zem"))
    house.kitchen.cooking()

}

