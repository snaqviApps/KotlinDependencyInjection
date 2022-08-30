package ghar.learning.di.dependency.module

import javax.inject.Inject

class House @Inject constructor() {         // Need to provide here street-number(Int), and title (string)

    /** filed injection */
    @Inject lateinit var kitchen: Kitchen

    init {
        println("House built")
    }

    @Inject
    fun helloRegisteredHouse(building : Building) {         /** Method-Injection */
        building.injectRegisteredHouse(this)
    }

    override fun toString(): String {
        return "This is House-toString() call"
    }
}