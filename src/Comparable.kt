import java.util.*
import kotlin.collections.ArrayList

/*
* Created by lukman on 21/03/20 / 03.34
* Project Name : KotlinBasic
*/

class Person(var name:String, var age:Int): Comparable<Person>{
    override fun compareTo(other: Person): Int {
        return  other.age- this.age
    }
}

fun main(args: Array<String>) {
    var listOfNames= ArrayList<Person>()
    listOfNames.add(Person("maryam", 9))
    listOfNames.add(Person("khodijah", 7))
    listOfNames.add(Person("hafshah", 5))
    listOfNames.add(Person("zainab", 3))

    println("before sort")
    for (person in listOfNames){
        println("Name:"+person.name)
        println("Age:"+person.age)
    }

    println("after sort")
    Collections.sort(listOfNames)
    for (person in listOfNames){
        println("Name:"+person.name)
        println("Age:"+person.age)
    }

}
