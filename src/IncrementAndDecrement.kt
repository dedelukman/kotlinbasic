/*
* Created by lukman on 14/03/20 / 15.44
* Project Name : KotlinBasic
* Operation rules | Priorities rules
* 1- ()
* 2- ++, -- (before var)
* 3- ^
* 4- *, /
* 5- +, -
* 6- =
* 7- ++, -- (After Var)
*/
fun main(args: Array<String>) {

    var x=10
    var y=11
    var z=--x+y  // (++x)=(x=x+1), (--x)=(x=x-1)
    println("z:$z")

    var m=x+++y
    println("x:$m")

}
