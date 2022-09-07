package ghar.learning.di.dependency

import dagger.Component
import ghar.learning.di.dependency.module.BuildingModule
import ghar.learning.di.dependency.nomudule.House
import ghar.learning.di.dependency.module.UsingModules

@Component(modules = [UsingModules::class, BuildingModule::class])
interface AppGraph {
    fun injectHouse(): House
}