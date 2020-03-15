/*
* Created by lukman on 16/03/20 / 02.17
* Project Name : KotlinBasic
*/
fun main(args: Array<String>) {

    var map=HashMap<Int, String>()
    map.put(1, "dede")
    map.put(2, "lukman")
    map.put(33, "hakim")
    println(map.get(33))

    map.put(33,"hakim jaksa")
    for (k in map.keys){
        println(map.get(k))
    }

}
