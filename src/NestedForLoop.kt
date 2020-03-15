/*
* Created by lukman on 15/03/20 / 14.09
* Project Name : KotlinBasic
*/
fun main(args: Array<String>) {

    for (item in 1..5)
    { // block of code
        println("count:$item")
        for (count2 in 1..7){
            println("count2:$count2")
        }

        println("loop nested done")
    }

    println("loop done")

}
