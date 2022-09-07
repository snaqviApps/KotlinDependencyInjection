package ghar.learning.di.dependency.module

import dagger.Binds
import dagger.Module
import ghar.learning.di.dependency.Bungalow
import ghar.learning.di.dependency.nomudule.Building

@Module
abstract class BuildingModule {

    /**
     * This abstract method injects Building-interface using Bungalow-Instance, wherever needed
     */

    @Binds
    abstract fun injectBuilding(bungalow: Bungalow) : Building
}