package ghar.learning.di.dependency

import dagger.Component
import ghar.learning.di.dependency.nomudule.House
import ghar.learning.di.dependency.module.GsonModule
import javax.inject.Singleton

@Singleton
/** singleton-dependency forces to annoate component
 * as singleton
 * */
@Component(modules = [GsonModule::class])
interface AppGraph {
    fun injectHouse(): House
}