/*
* Created by lukman on 14/03/20 / 14.50
* Project Name : KotlinBasic
*/
fun main(args: Array<String>) {

    var n1:Int=10
    var n2:Int?
    var n2Str:String="12"
//    n2=n2Str error because different data type, must convert
    n2=n2Str.toInt()
    var n2Float:Float?
    n2Float=n2Str.toFloat()
    println("n1:"+n1)
    println("n2:"+n2)
    println("n2Float:"+ n2Float)

    var xpi:Double=3.74
    println("xpi:"+ xpi)
    var IntPi:Int=xpi.toInt()
    println("IntPi:"+ IntPi)



}
