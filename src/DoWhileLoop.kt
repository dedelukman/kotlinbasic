/*
* Created by lukman on 15/03/20 / 14.20
* Project Name : KotlinBasic
*/
fun main(args: Array<String>) {

    var count=1
    do
    { // block of code
        println("enter the loop")
        if (count==2)
            println("count:$count")
        count++
    }while (count <=5)

    println("loop done")

}
