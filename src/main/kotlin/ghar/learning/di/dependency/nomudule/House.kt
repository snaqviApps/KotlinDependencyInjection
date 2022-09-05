package ghar.learning.di.dependency.nomudule

import com.google.gson.Gson
import ghar.learning.di.dependency.model.Person
import javax.inject.Inject

class House @Inject constructor() {         // Need to provide here street-number(Int), and title (string)

    /** filed injection */
    @Inject lateinit var kitchen: Kitchen

    /** Using Module-Provide mechanism */
    @Inject lateinit var gson : Gson

    init {
        println("House built")
    }

    @Inject
    fun helloRegisteredHouse(building : Building) {         /** Method-Injection */
        building.injectRegisteredHouse(this)
    }

    fun useGson(person: Person){
        val json:String = gson.toJson(person)
        println("POJO to Json: $json")
    }

    override fun toString(): String {
        return "This is House-toString() call"
    }
}