/*
By default, classes are final in nature which means that you cannot extend classes usually
unless you write
open class Vehicle{

}
To add constructor into a class, its added using Constructor which is a reserved keyword for creating
constructor functions
 */

class Vehicle(var wheels: Int) {        //inner variables, primary constructor
//    var wheels = wheels

    /*
    var wheels = 2
    constructor(wheels: Int){
        this.wheels = wheels
    }
    */

    fun getAxles() : Int {
        return wheels/2
    }
}

//The new keyword doesn't exist in kotlin, if Vehicle is a class, we just call Vehicle() like a function
//It means its a constructor
fun main(){
    val v = Vehicle(4)
    println(v.wheels)
    println(v.getAxles())
}