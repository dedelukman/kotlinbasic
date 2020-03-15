/*
* Created by lukman on 15/03/20 / 13.29
* Project Name : KotlinBasic
*/
fun main(args: Array<String>) {

    var x=3
    when(x){
        1,2-> {
            print(" value is 1 or 2")
        }
        in 10..30-> {
            println(" value is range 10..30")
        }
        !in 10..30-> {
            println(" value is not range 10..30")
        }
        else -> {
            println(" value is out of range")
        }
    }

}
