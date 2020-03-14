/*
* Created by lukman on 14/03/20 / 15.02
* Project Name : KotlinBasic
* Math calculator
*/
fun main(args: Array<String>) {
    println("---- Math calculator ----")
    print("enter n1:")
    var n1:Float= readLine()!!.toFloat()
    print("enter n2:")
    var n2:Float= readLine()!!.toFloat()
    var sum:Float?
    sum=n1*n2
    print("Sum:"+sum)

}
