/*
* Created by lukman on 15/03/20 / 13.16
* Project Name : KotlinBasic
*/
fun main(args: Array<String>) {
    print("enter your grade:")
    var grade= readLine()!!.toDouble()

    if (grade>=90){
        // block of code
        println(" You are in A level")
    }else{
        //block of code
        println(" You are not in A level")
    }



    println(" you enter grade $grade")

}
