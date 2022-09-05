package ghar.learning.di.dependency.module

import com.google.gson.Gson
import dagger.Module
import dagger.Provides

@Module
class UsingModules {

    @Provides
    fun injectsGson():Gson{
        return Gson()
    }
}