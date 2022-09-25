package ghar.learning.di.dependency.nomudule

import com.google.gson.Gson
import ghar.learning.di.dependency.model.Person
import javax.inject.Inject
import javax.inject.Named

class House @Inject constructor(@Named("countryTwo") country : String) {         // Need to provide here street-number(Int), and title (string)


    @Inject @Named("Jill") lateinit var person: Person     // field injection

    /** Module-Provides mechanism */
    @Inject lateinit var gson : Gson

    init {
        println("House built in $country")
    }

    fun greetingsLandLord() {
        val json:String = gson.toJson(person)
        println("POJO to Json: $json")
    }

    override fun toString(): String {
        return "This is House-toString() call"
    }
}