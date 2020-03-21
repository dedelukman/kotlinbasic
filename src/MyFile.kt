import java.io.FileWriter

/*
* Created by lukman on 21/03/20 / 07.24
* Project Name : KotlinBasic
*/
fun main(args: Array<String>) {
    print("Write to file text : ")
    var str:String= readLine().toString()
    WriteToFile(str)
}

fun WriteToFile(str:String){
    try {
    var fo=FileWriter("text.txt",true)
    fo.write(str+"\n")
    fo.close()
    }catch (ex:Exception){
        print(ex.message)
    }
}