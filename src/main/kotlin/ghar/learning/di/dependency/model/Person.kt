package ghar.learning.di.dependency.model

/** approach 01: using data-class */
//data class Person(val age:Int, val personName:String) { }

/** approach 02: custom constructor*/
class Person(private var age: Int, private var personName: String) {  }