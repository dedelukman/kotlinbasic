import java.io.FileReader
import java.io.FileWriter

/*
* Created by lukman on 21/03/20 / 07.24
* Project Name : KotlinBasic
*/
fun main(args: Array<String>) {
    println("1- read\n2- write \n")
    val op= readLine()!!.toInt()
    when(op){
        1-> ReadfromFile()
        2->{
            print("Write to file text : ")
            var str:String= readLine().toString()
            WriteToFile(str)
        }
    }


}

fun WriteToFile(str:String){
    try {
        val fo=FileWriter("text.txt",true)
        fo.write(str+"\n")
        fo.close()
        println("data is saved")
    }catch (ex:Exception){
        print(ex.message)
    }
}

fun ReadfromFile(){
    try {
        var fin=FileReader("text.txt")
        var c:Int?
        do {
            c=fin.read()
            print(c.toChar())
        }while (c!=-1)
    }catch (ex:Exception){
        print(ex.message)
    }
}