/*
* Created by lukman on 16/03/20 / 03.25
* Project Name : KotlinBasic
*/

class  Car(var type:String,var model:String,
           var price:Double,
           var milesDrive:Int, var owner:String){

    fun getCarPrice():Double{
        return this.price- (this.milesDrive.toDouble()*10)
    }

}
fun main(args: Array<String>) {

   val decar= Car("Wuling","Almaz",300000000.0,105,"lukman")
    println("hucar:" + decar.getCarPrice())
    val facar= Car("Suzuki","Igniz",150000000.0,12,"lukman")
    println("facar:" +facar.getCarPrice())
}
