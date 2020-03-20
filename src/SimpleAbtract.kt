/*
* Created by lukman on 21/03/20 / 02.15
* Project Name : KotlinBasic
*/

abstract class CreditCard(){
    fun CreditID():String{
        return "454df4da5a4d"
    }
    abstract fun newCredit()

}

class UserInfo(): CreditCard(){
    fun getInfo():String{
        return CreditID()
    }

    override fun newCredit(){
        println(" new card created")
    }
}


fun main(args: Array<String>) {

//    var credit = CreditCard()     cannot direct implementation abstract
//    println(credit.CreditID())

    var user=UserInfo()
    println(user.getInfo())

}
