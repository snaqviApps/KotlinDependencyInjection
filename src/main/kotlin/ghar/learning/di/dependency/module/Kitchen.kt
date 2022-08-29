package ghar.learning.di.dependency.module

import javax.inject.Inject

class Kitchen @Inject constructor() {

    init {
        println("Kitchen - built")
    }
}