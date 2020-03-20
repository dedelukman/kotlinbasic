/*
* Created by lukman on 21/03/20 / 01.51
* Project Name : KotlinBasic
*/

interface op{
    fun sum(n1:Int, n2:Int) { println ("sum :"+ n1+n2)}
    fun div(n1:Int, n2:Int) {println ("div :"+ n1/n2)}
}

class UserOp:op{
    override fun sum(n1: Int, n2: Int) {
        println ("sum :"+ n1+n2)
    }

    override fun div(n1: Int, n2: Int) {
        println ("div :"+ n1/n2)
    }

}

class AdminOp:op{
    override fun sum(n1: Int, n2: Int) {
        println ("sum :"+ n1+n2*2)
    }

    override fun div(n1: Int, n2: Int) {
        println ("div :"+ n1/n2 * 2)
    }

}

class ManagerOp:op{

}

fun main(args:Array<String>){
    //TODO:
    var adminop = AdminOp()
    adminop.sum(1,4)
    var managerop= ManagerOp()
    managerop.div(5,6)

}






