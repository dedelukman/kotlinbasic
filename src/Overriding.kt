/*
* Created by lukman on 18/03/20 / 03.35
* Project Name : KotlinBasic
*/
open class Operations1(Name:String){  // open -> this class can inheritance

    open fun sum(n1:Int, n2:Int):Int{
        return n1+n2
    }
    fun div(n1:Int, n2:Int):Int{
        return n1-n2
    }
}

class MultiOperations1:Operations1{
    constructor(): super("lukman"){

    }
    var t:Int?=null
    override fun sum(n1:Int, n2:Int):Int{
        this.t
        this.sub(n1, n2)
        super.sum(n1, n2)
        return n1+n2*3
    }

    fun sub(n1:Int, n2:Int):Int{
        return n1-n2
    }
    fun mul(n1:Int, n2:Int):Int{
        return n1*n2
    }


}


fun main(args: Array<String>) {

    var op=Operations1("lukman")
    var sum= op.sum(10,15)
    println("sum: "+sum)
    var div= op.div(12,11)
    println("div: "+div)

    // second
    var op2=MultiOperations1() as Operations1
    sum= op2.sum(10,15)
    println("sum: "+sum)
    div= op2.div(12,11)
    println("div: "+div)
    // cannot call fuction sub and mul
    // because casting by class operatios,
    // but function overriding is still running


}

