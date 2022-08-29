package ghar.learning.di.dependency

import dagger.Component
import ghar.learning.di.dependency.module.House
import ghar.learning.di.dependency.module.Kitchen

@Component
interface AppGraph {

    fun injectHouse() : House
    fun injectKitchen() : Kitchen
}