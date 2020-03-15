/*
* Created by lukman on 16/03/20 / 02.25
* Project Name : KotlinBasic
*/
fun main(args: Array<String>) {

    var map= hashMapOf(1 to "dede", 2 to "lukman")
    map.put(3,"hakim")
    println(map.get(3))
    println(map[3])

    var ar= arrayOf(1,10,22,11)
    println(ar[0])
    var list = listOf(11,22,33,22)  // data list can not change
    var list1 = mutableListOf(11,22,33,22)
    list1[0]=22
    for (item in list){
        println(item)
    }

}
