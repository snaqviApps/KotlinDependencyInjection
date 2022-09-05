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
        val json:String = gson.toJson(person, Person::class.java)
        println("POJO to Json: $json")

//        val backToPOJO: Object = gson.fromJson(json, Object::class.java)
        val backToSchool = gson.fromJson(json, Object::class.java)
        println(message = "JSON to POJO: $backToSchool")
    }

    override fun toString(): String {
        return "This is House-toString() call"
    }
}