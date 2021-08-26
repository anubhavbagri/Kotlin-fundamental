lateinit var i : String // Late Initialization - set the values at some later point in time

var s : String? = null
fun main()
{
//    val size = s?.length
//    val size : Int = s?.length!!
//    val size : Int? = s?.length
    s = "helloKotlin"
    val size : Int = s?.length ?: 0
//    println("Hello world")
    val a = "hello world"
    val a1 = 10
    val b : Int = 234
    val c : String = "23"
    val d : Float = 23.0F
    val e : Boolean = false
    val f : Double = 89.0;
//    f = 90.45
    var str = "anubhav"
    str = "bagri"
    i = "now initialized"
    println(s)
    println(size)
    println(i)
    print("\n" + c)
    println(e)
    println(str)
    println("This is ${str.capitalize()} with length as ${str.length}"); //b of bagri turns capital
}
