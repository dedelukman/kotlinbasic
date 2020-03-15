/*
* Created by lukman on 16/03/20 / 02.34
* Project Name : KotlinBasic
*/
fun main(args: Array<String>) {

    var setEmenet= setOf(1,2,3,11,44,55,55) // data canot change
    for (element in setEmenet){
        println(element)
    }

    var setEmenetM= mutableSetOf(1,2,3,11,44,55,55)
    setEmenetM.add(77)
    for (element in setEmenetM){
        println(element)
    }


}
