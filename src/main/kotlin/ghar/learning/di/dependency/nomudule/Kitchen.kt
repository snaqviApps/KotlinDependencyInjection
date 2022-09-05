package ghar.learning.di.dependency.nomudule

import javax.inject.Inject

class Kitchen @Inject constructor() {

    init {
        println("Kitchen built")
    }

    fun cooking() {
        println("cooking...") }
}