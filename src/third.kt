/*
functions : breaking your code into smaller parts of code to handle, reuse, and manage easily. Starts with fun keyword in kotlin
arguments : value sent inside function definition(parameter)
*/
fun main(){
    getName()
    println(square(10))
    println(square2(9))
    println(square3(8))
    getMeUser("ANUBHAV",23, true)
    getMeUser1("Ayush",20) // parameters of the calling function overcomes the parameters of the called function.
    getMeUser2(age = 49, isActive = false, name = "vijay") //could also pass arguments in different order of their type
//  getMeUser("Anubhav",isActive = true, age = 23) - you could start with the named or positional argument but getMeUser("Anubhav", age = 18, false) is not allowed
    countAndPrintArgs(2,3,3,4,5,6,7,8,7,9)

}
//similar to writing variables
//val userName: String = "Bagri"

fun getName(): String{
    return "Anubhav"
}

fun square(number: Int): Int{
    return number * number
}
fun square2(number: Int): Int = number * number

fun square3(number: Int) = number * number

fun thisFunctionShouldStartWithLowerCase(){
    //This is lowerCamelCase
}
/*
    Type of Arguments
    1. Positional Arguments
    2. Default Arguments
    3. Named Arguments
 */
fun getMeUser(name:String, age:Int, isActive:Boolean){
}
fun getMeUser1(name:String, age:Int = 19, isActive:Boolean = false){
    println("Name = $name, Age = $age, IsActive = $isActive")
}
fun getMeUser2(name:String, age:Int, isActive:Boolean){
    println("Name = $name, Age = $age, IsActive = $isActive")
}
/*
vararg - it basically allows us to take multiple arguments inside any function
 */
fun countAndPrintArgs(vararg number: Int){
    println(number.size) //returns the counts of number of values in number
    for(n in number) println(n)
}