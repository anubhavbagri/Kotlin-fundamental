
fun main(){
    val acc = Account(12345,"anubhav", 1000f)
    println("Account number ${acc.accNo}, Account Holder : ${acc.name}, Amount ${acc.amount}")
//    val acc = Account(12345,"Anubhav", 1000f)
//    acc.insert(12345,"Anubhav", 1000f)
    acc.deposit(100f)
    acc.withDraw(150f) //gets rejected.
    acc.withDraw(50f)
    println(acc.amount)
//    println("Account number ${acc.accNo}, Account Holder : ${acc.name}, Amount ${acc.amount}")
}

class Account(accNo: Int,name: String,amount: Float) //primary constructor with the init block doesn't require var
{
    var accNo: Int
    var name: String
    var amount: Float
    init {
        this.accNo = accNo
        this.name = name.capitalize() //inbuilt function which converts first letter of the word to capital
        this.amount = amount + 10000

    }
//    class Account(var accNo: Int,var name: String,var amount: Float)    //one way to write primary constructor

//    Properties or Attributes
//    var accNo : Int = 0
//    var name : String? = null
//    var amount : Float = 0f
    /*
    constructors - A function with same name as class name
    It is used to construct or initialize the class
    Two types of constructors:
    1. Primary Constructor - can have only 1
    2. Secondary Constructor - Multiple Secondary constructors possible
    */

    //Member functions
    //this - points to the current receiver/ current class object or reference
//    fun insert(accNo:Int, name:String, amount:Float){
//        this.accNo = accNo
//        this.name = name
//        this.amount = amount
//    }

    fun deposit(money:Float){
        amount+=money   //short-hand operator
        println("\n$amount")
    }

    fun withDraw(money: Float){
        if(amount < money){ //amount = 5 && money == 6
            println("Not sufficient funds")
        }
        else{
            amount-=money
            println(amount)
        }
    }
}
