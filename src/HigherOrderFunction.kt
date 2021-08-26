fun main(args: Array<String>) {
    var x = 10F
    var y : Int = x.toInt()
    y++
    println("Hello World" + y)
    val osmString = awesomeFun("Ayush") //val osmString : String = awesomeFun("Ayush")
    println(osmString)

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

//By default, functions return a datatype called 'Unit'
//Unit means a function does not return anything

fun awesomeFun(name: String): String {
    return "$name is awesome!"
}
