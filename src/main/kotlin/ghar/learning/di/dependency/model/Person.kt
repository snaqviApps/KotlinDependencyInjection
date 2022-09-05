package ghar.learning.di.dependency.model

/** approach 01: using data-class */
//data class Person(val age:Int, val personName:String) { }

/** approach 02: custom constructor*/
class Person(private var age: Int, var personName: String) {

    private var _age:Int
        get() = age
        set(value) {
            age = value
        }

    private var _personName:String
        get() = personName
        set(value) {
            personName = value
        }
}