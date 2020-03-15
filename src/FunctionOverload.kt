import kotlin.math.atan2

/*
* Created by lukman on 16/03/20 / 03.02
* Project Name : KotlinBasic
*/

fun sum(n1:Int, n2:Int):Int{
    return n1+n2

}

fun sum(n1:Int, n2:Int, n3:Int):Int{
    return n1+n2+n3

}

fun sum(n1:Int, n2:Int, n3:Int, n4:Int):Int{
    return n1+n2+n3+n4

}
fun main(args: Array<String>) {

    var sumNumber=sum(10,11)
    println("sum=$sumNumber")

    sumNumber=sum(10,11, 54)
    println("sum=$sumNumber")

    sumNumber=sum(10,11,45,33)
    println("sum=$sumNumber")

}
