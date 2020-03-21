/*
* Created by lukman on 21/03/20 / 07.59
* Project Name : KotlinBasic
*/
fun main(args: Array<String>) {
    var t1= thread("dede")
    t1.start()

    var t2= thread("lukman")
    t2.start()

    var t3= thread("hakim")
    t3.start()
    t3.join()
    println(" thread is run")

}

class thread():Thread(){
    var ThreadName:String= ""

    constructor(ThreadName:String):this(){
        this.ThreadName=ThreadName
        println(this.ThreadName+" is starting")
    }
    override fun run() {
//        super.run()
        // Write Thread
        var count=0
        while (count<10){
            println(this.ThreadName +" Count:$count")
            count++
            try {
                Thread.sleep(1000)
            }catch (ex:Exception){
                print(ex.message)
            }
        }
    }
}
