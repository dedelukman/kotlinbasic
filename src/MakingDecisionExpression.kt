/*
* Created by lukman on 15/03/20 / 13.43
* Project Name : KotlinBasic
*/
fun main(args: Array<String>) {

    var n1=10
    var n2=20
    var max= if (n1>n2) n1 else n2
    print("max: $max")

    //When

    var age=30

    var isYoung=when(age){
        30-> true
        else-> false
    }
    print("isYoung:$isYoung")

}
