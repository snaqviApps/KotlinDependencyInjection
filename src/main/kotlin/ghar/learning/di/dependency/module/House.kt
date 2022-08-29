package ghar.learning.di.dependency.module

import javax.inject.Inject

class House @Inject constructor() {

    init {
        println("house built")
    }

    override fun toString(): String {
        return "This is House-toString() call"
    }
}