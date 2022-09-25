package ghar.learning.di.dependency

import dagger.Component
import ghar.learning.di.dependency.nomudule.House
import ghar.learning.di.dependency.module.GsonModule
import javax.inject.Singleton

/** singleton-dependency forces to annotate
 * component as singleton
 */
@Singleton
@Component(modules = [GsonModule::class])
interface AppGraph {
    fun injectHouse(): House
}