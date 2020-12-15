// ; means end of the line but its redundant unless writing multiple statements on the same line.
fun main(){
//    it works on vararg
    /*
    [vararg] - it tells that you can have n numbers of arguments inside any function.
     */
    val numbers = arrayOf(1,2,3,4,5)
    val name = arrayOf("1","2","3","4",5, 6.34) //we haven't given any type of array
    val nameString = arrayOf<String>("anubhav","ayush","suhit","devraj","rishav")
    nameString.set(0,"z")
    println(nameString[0])
    print(numbers[0])
//    val num = Array(size:5, {i->i*1})
    val numArray = intArrayOf(1)
//    val nullArray = arrayOfNulls<String>(size:10)
    println(numArray[0])
//    print(numbers.get(0))
    /*
    lists or Collections
     */
    /*
        to make immutable lists
     */
    var listOfNames = listOf<String>("Hello","world","coder","kotlin")
    var mapOfNames = mapOf<Int, String>(0 to "Hello",3 to "world",2 to "coder",7 to "kotlin")
    println(mapOfNames[7])
    var mapOfNames1 = mapOf("name" to "Hello",3.87 to "world",2 to 20,9 to "kotlin")
    println(mapOfNames1["name"])
    //    var hashMapOfNames = hashMapOf<int,int>(0 to 3, 2 to 7, 4 to 97)
    /*
        to make mutable lists
     */
    var mutableListOfNames = mutableListOf<String>("Hi","anubhav","bagri")
    mutableListOfNames.add("Pulkit")
    var mutableArrayListOfNames = arrayListOf<String>("don't know","Yes","No")
    var hashMapOfNames = hashMapOf("name" to "Hello",3.87 to "world",2 to 20,9 to "scene")
    //    hashMapOfNames.add("agarwal")
    hashMapOfNames.set("work","google")
    //    hashMapOfNames["work"] = "google"
    println(hashMapOfNames["work"])
    /*
        For-each loop : iterate over the entire set of items/collection of items and gives the value of every item
     */
    hashMapOfNames.forEach { (any, any2) ->
        println("" + any + any2)
    }
    mutableArrayListOfNames.forEach {
        println(it)
    }
    nameString.forEach {
        println(it)
    }
    numArray.forEach {
        println(it)
    }
    println("----")
    /*
    other Loops in kotlin
     */
    for(name in nameString){
        println(name)
    }
    println("----")
    for(x in 0..10){
        //10 is inclusive
        println(x)
    }
    println("----")
    for(x in 0 until 10){
        //10 is exclusive
        println(x)
    }
    println("----")
    for(x in 0 until 10 step 2){
        //10 is exclusive, prints forward 0 2 4 6 8
        println(x)
    }
    println("----")
    for(x in 10 downTo 0 step 2){
        //0 is inclusive, prints backward 10 8 6 4 2 0
        println(x)
    }
    println("----")
    var a = 10
    while (a>0){
        print(" $a")
        a-=3
    }
    println()
    do {
        print(" $a")
        a-=2
    }while (a>-10);
    /* Few keywords: https://kotlinlang.org/docs/reference/keyword-reference.html
        as- casts variables into specific type
        Any- variable assigned, can be of any type
        as? - variable can be even null
        fun- declares a function
        in- used in FOR loop to setup ranges
        is- checks whether particular variable is of that specific datatype or not
     */
    val xyz: Any = "anubhav"
    val Strxyz: String = xyz as String
    if(xyz is String){
        print("\n ${xyz.length}")
    }
    /*
    when()- replacement for switch case, checks the value of particular variable & match with the particular case
     */
    when(xyz){
        "ayush"->{
            print("\nName1")
        }
        "anubhav"->{
            print("\nName2")
        }
        "vijay"->{
            print("\nName3")
        }
        else->{
            print("\nNo match")
        }
    }
    val output = when(xyz){
        "ayush"->"1"
        "anubhav"->"2"
        "vijay"->"3"
        else->"invalid name"
    }
    print("\n $output")
    /*
    functions
     */
    
}

