package ghar.learning.di.dependency.nomudule

import javax.inject.Inject

class Kitchen @Inject constructor(){

    init {
        println("Kitchen build")
    }

    fun cooking(){
        println("Today's Chicken day!!")
    }
}
