/*
* Created by lukman on 16/03/20 / 02.08
* Project Name : KotlinBasic
*/
fun main(args: Array<String>) {

    var arrayList= ArrayList<String>()
    arrayList.add("maryam")
    arrayList.add("khodijah")
    arrayList.add("hafshah")
    arrayList.add("zainab")

    println("First name:"+arrayList.get(0))
    arrayList.set(0,"hasna maryam")

    println("All element by object")
    for ( item in arrayList){
        println(item)
    }

    println("All element by index")
    for ( index in 0..arrayList.size-1){
        println(arrayList.get(index))
    }

    //search
    if (arrayList.contains("Khodijah")){
        println("name is found")
    }else{
        println("name is not found")
    }


}
