/*
* Created by lukman on 21/03/20 / 02.35
* Project Name : KotlinBasic
*/

class  UserAdmins<T>(credit:T){
    init {
        println(credit)
    }
}

fun <T> display(procces:T){
    println(procces)
}

fun main(args: Array<String>) {

    var useradmin= UserAdmins<String>("lukman")
    var useradmin2= UserAdmins<Int>(264632)
    var useradmin3= UserAdmins<Double>(36565.3)

    display<Int>(22)
    display<String>("procces user")

}
