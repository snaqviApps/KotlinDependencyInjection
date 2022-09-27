package ghar.learning.di.dependency

import dagger.Component
import dagger.Provides
import ghar.learning.di.dependency.model.Car
import ghar.learning.di.dependency.nomudule.House
import ghar.learning.di.dependency.module.AppModule
import javax.inject.Singleton

/** singleton-dependency forces to annotate
 * component as singleton
 */
@Singleton
@Component(modules = [AppModule::class])
interface AppGraph {
    fun injectHouse(): House

    fun injectCar(car : Car)
}