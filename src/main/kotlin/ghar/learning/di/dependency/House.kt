package ghar.learning.di.dependency

import javax.inject.Inject

class House @Inject constructor() {

    init {
        println("House created")
    }

    override fun toString(): String {
//        return super.toString()
        return "This is House-toString() call"
    }
}