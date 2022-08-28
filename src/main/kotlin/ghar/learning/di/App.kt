package ghar.learning.di

import ghar.learning.di.dependency.House

class App {

    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            println("Hi from Kotlin-Dependency Injection using Dagger-2, Simple Kotlin-App: ")

            var house = House()
            println(house)
        }
    }
}