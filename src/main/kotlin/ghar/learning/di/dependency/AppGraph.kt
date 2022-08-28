package ghar.learning.di.dependency

import dagger.Component

@Component
interface AppGraph {

    fun getHouse():House
}