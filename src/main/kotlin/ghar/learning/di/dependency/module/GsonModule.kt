package ghar.learning.di.dependency.module

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class GsonModule {

    @Provides
    @Singleton
    fun injectsGson():Gson {
        return Gson()
    }
}