/*
* Created by lukman on 16/03/20 / 02.40
* Project Name : KotlinBasic
*/

fun sum(n1:Double, n2:Double):Double{
    //block
    var sum= n1+n2
    return  sum
}

fun disply(n:Int=0):Unit{
    println("n:$n")
}

fun displyNoInput(n:Int=0):Unit{
    println("Welcome to display")
}

fun main(args: Array<String>) {
    var r= sum(10.0,12.0)
    println("r:$r")

    r= sum(5.0,16.0)
    println("r:$r")

    r= sum(110.0,56.0)
    println("r:$r")

    disply(134)
    displyNoInput()


}
