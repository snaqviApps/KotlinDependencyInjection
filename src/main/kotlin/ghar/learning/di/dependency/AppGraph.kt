package ghar.learning.di.dependency

import dagger.Component
import ghar.learning.di.dependency.module.House
import ghar.learning.di.dependency.module.Kitchen

//@Component
@Component(modules = [House::class])
interface AppGraph {

    fun injectHouse() : House
    fun injectKitchen() : Kitchen

    @Component.Builder
    interface Builder {
        fun houseModule(house : House) : Builder
        fun build() : AppGraph
    }
}