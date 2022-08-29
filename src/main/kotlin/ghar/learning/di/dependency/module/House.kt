package ghar.learning.di.dependency.module

import dagger.Module
import javax.inject.Inject

@Module
class House @Inject constructor() {

    init {
        println("house built")
    }

    override fun toString(): String {
        return "This is House-toString() call"
    }
}