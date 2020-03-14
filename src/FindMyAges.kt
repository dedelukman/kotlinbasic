import java.time.Year
import java.util.*

/*
* Created by lukman on 14/03/20 / 15.56
* Project Name : KotlinBasic
*/
fun main(args: Array<String>) {

    // input
    print("Enter your DOB:")
    var DOB:Int= readLine()!!.toInt()

    //process
    var year=Calendar.getInstance().get(Calendar.YEAR)
    var age=year- DOB

    //output
    println(" your age is $age years")


}
