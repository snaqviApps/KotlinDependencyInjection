package ghar.learning.di.dependency.module

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import ghar.learning.di.dependency.model.Person
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule {

    /**
     * @Named approach is applied when same dependency is being injected
     * but with different @Provides-methods are there to handle
     */

    @Provides
    @Singleton
    fun injectsGson():Gson {
        return Gson()
    }

    @Provides
    @Named("Jack")
    fun getPerson() = Person(40, "auto-injected-Jack")

    @Provides
    @Named("Jill")
    fun getPersonJill() = Person(75, "auto-injected-Jill")

    @Provides
    @Named("country")
    fun getCountry() = "USA"

    @Provides
    @Named("countryTwo")
    fun getCountryTwo() = "China"

}