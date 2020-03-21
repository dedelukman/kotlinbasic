/*
* Created by lukman on 21/03/20 / 07.13
* Project Name : KotlinBasic
*/
fun main(args: Array<String>) {

    try {
    print("Eter your number :")
    var n2:Int= readLine()!!.toInt()
    var Div=100/n2
    println("DIV:$Div")

    println("app is done")
    }catch (ex:Exception){
        println(ex.message)
    }

}
