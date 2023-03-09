fun main() {
    var character=Car("Chevrolet","Equinox","Black",14)

    character.carry(14)
    character.identity()
    character.calculateParkingFees(3)

    var vehicle=Bus(" Nissan","Altima","Yellow",30)

    vehicle.carry(33)
    vehicle.identity()
    println(vehicle.maxTripFare(200.00))
    println(vehicle.calculateParkingFees(1))
}


open class Car(var make:String,var model:String,var color:String,var capacity:Int){

    fun carry(people: Int){
        var x=people-capacity
        if(people<=capacity){
           println("Carrying $people passengers") }
        else{
            println("Over capacity by $x people") }
    }

    fun identity(){
        var traits="I am a $color $make $model"
        println(traits)
    }

   open fun calculateParkingFees(hours:Int):Int{
        var fees=hours*20
        return fees }

}
class Bus (make:String,model:String,color:String,capacity:Int):Car(make,model,color,capacity){


    fun maxTripFare (fare: Double):Double{
        var amount=capacity*fare
        return amount
    }

   override fun calculateParkingFees(hours:Int):Int{
        var fees=hours*20
        return fees }
}











