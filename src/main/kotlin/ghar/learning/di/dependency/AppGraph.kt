package ghar.learning.di.dependency

import dagger.Component
import ghar.learning.di.dependency.nomudule.House
import ghar.learning.di.dependency.module.GsonModule

@Component(modules = [GsonModule::class])
interface AppGraph {
    fun injectHouse(): House
}