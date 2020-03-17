/*
* Created by lukman on 18/03/20 / 03.00
* Project Name : KotlinBasic
*/

open class Operations(){  // open -> this class can inheritance
    var ProcessName:String?=null
    public var ProcessNamePub:String?=null  // it's the same if you don't use 'public'
    protected var ProcessNamePro:String?=null
    private var ProcessNamePri:String?=null
    fun sum(n1:Int, n2:Int):Int{
        return n1+n2
    }
    fun div(n1:Int, n2:Int):Int{
        return n1-n2
    }
}

class MultiOperations():Operations(){

    fun sub(n1:Int, n2:Int):Int{
        return n1-n2
    }
    fun mul(n1:Int, n2:Int):Int{
        return n1*n2
    }

    fun GetName(){
        super.ProcessName
        super.ProcessNamePub
        super.ProcessNamePro
//        super.ProcessNamePri    _// cannot do this because variable is private
    }
}


fun main(args: Array<String>) {

    var op=Operations()
    var sum= op.sum(10,15)
    println("sum: "+sum)
    var div= op.div(12,11)
    println("div: "+div)

    // second
    var op2=MultiOperations()
    sum= op2.sum(10,15)
    println("sum: "+sum)
    div= op2.div(12,11)
    println("div: "+div)

    println("ProcessName"+op.ProcessName)
    println("ProcessName"+op.ProcessNamePub)
//    cannot call private and protected variables

}
