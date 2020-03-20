/*
* Created by lukman on 21/03/20 / 02.29
* Project Name : KotlinBasic
*/

enum class Direction{
    NORTH, SOUTH, EAST, WEST
}
fun main(args: Array<String>) {

    var userdirect=Direction.SOUTH

    if (userdirect==Direction.NORTH){
        println(" he went to nort")
    }else{
        println( "i dont know where he went")
    }

}
