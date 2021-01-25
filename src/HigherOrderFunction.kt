fun main(args: Array<String>) {
    var x = 10F
    var y : Int = x.toInt()
    y++
    println("Hello World" + y)

    getUser("Bagri"){

    }
}

//Higher Order functions - send a function as an argument
//So, whenever you pass a function as an argument, you have to specify the return type of the function

fun getUser(name: String, doNothing:(IsActive: Boolean) -> Unit): String{
    /*
    body
     */
    if(name == "Bagri"){
        doNothing(true)
    }else{
        doNothing(false)
    }

    return "Anubhav $name"
}
