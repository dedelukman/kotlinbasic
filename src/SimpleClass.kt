/*
* Created by lukman on 16/03/20 / 03.25
* Project Name : KotlinBasic
*/

class  Car(){
    var type:String?=null
    var model:String?=null
    var price:Double?=null
    var milesDrive:Int?=null
    var owner:String?=null
    constructor(type:String,model:String,
                price:Double,
                milesDrive:Int,owner:String):this(){
        this.type=type
        this.model=model
        this.price=price
        this.milesDrive=milesDrive
        this.owner=owner
        println("constructor1")
    }
    constructor(owner: String):this(){
        this.owner=owner
        println("constructor2")
    }

    fun getCarPrice():Double{
        return this.price!!- (this.milesDrive!!.toDouble()*10)
    }

}
fun main(args: Array<String>) {

   val decar= Car("Wuling","Almaz",300000000.0,105,"lukman")
    println("hucar:" + decar.getCarPrice())
    val facar= Car("Suzuki","Igniz",150000000.0,12,"lukman")
    println("facar:" +facar.getCarPrice())
    val macar= Car("Maryam")
}
