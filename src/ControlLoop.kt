/*
* Created by lukman on 15/03/20 / 14.25
* Project Name : KotlinBasic
*/
fun main(args: Array<String>) {

   loop@ for (count in 1..10){
       if (count==1){
           continue
       }
       println("count:$count")
        for (count2 in 1..5) {
            println("count:$count")
            if (count2==3){
                break@loop
            }else if (count2==3){
                break
            }
        }


    }

}
