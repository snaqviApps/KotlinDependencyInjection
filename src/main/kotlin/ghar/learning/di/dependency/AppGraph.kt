package ghar.learning.di.dependency

import dagger.Component
import ghar.learning.di.dependency.module.House

@Component
interface AppGraph {
    fun injectHouse():House
}