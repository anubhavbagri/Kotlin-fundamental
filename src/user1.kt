import java.time.temporal.TemporalAmount

fun main(){
    val acc = Account1(12345,"anubhav", 1000f)
    val acc2 = Account1(12345)
    val acc3 = Account1(12345, name = "Anubhav")
    println("Account number ${acc.accNo}, Account Holder : ${acc.name}, Amount ${acc.amount}")
    acc.deposit(100f)
    acc.withDraw(150f)
    acc.withDraw(50f)
    println(acc.amount)
}

class Account1 //for secondary constructor
{
    var accNo: Int = 1
    var name: String = ""
    var amount: Float = 0f

    //multiple constructors
    constructor(accNo: Int){
        this.accNo = accNo
        name = "Default"
        amount = 0f
    }
    constructor(accNo: Int, name: String){
        this.accNo = accNo
        this.name = name
        amount = 0f
    }
    constructor(accNo: Int, name: String, amount: Float){
        this.accNo = accNo
        this.name = name
        this.amount = amount
    }

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