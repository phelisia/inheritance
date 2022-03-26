fun main(){
    var gari=Car("CAMRI","TOYOTA",5,"Silver")
    gari.carry(3)
    gari.carry(19)
    gari.identity()
    gari.calculateParkingFees(3)


    var nicco=Bus("MITSUBISHI","TOYOTA",38,"green")

     nicco.maxTripFare(23.3)
    nicco.calculateParkingFees(7)




}




 open class Car ( var model:String,  var make:String,   var capacity:Int, var color:String) {
     fun carry(people: Int) {
        var zote= people-capacity

         if (people<=capacity){
             println("carry $people passengers")
         }
         else
             println("overcarrying by $zote ")
         }
     fun identity() {
         println("I am a $color $make $model")

     }

    open fun calculateParkingFees(hours: Int): Int {
         var parkingFees = 20
        var zote=parkingFees * hours
         println(zote)
         return zote


     }
 }

class Bus(model:String, make:String,capacity:Int,color:String):Car(model,make,capacity,color) {
    fun maxTripFare(fare: Double): Double {
        var max = 20
        var totalAmount = max * fare
        println(totalAmount)
        return totalAmount
    }

    override fun calculateParkingFees(hours: Int): Int {
        var product=hours*capacity
        println(product)
        return product

    }
}


















