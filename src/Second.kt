fun main(){
//    it works on vararg
    /*
    [vararg] - it tells that you can have n numbers of arguments inside any function.
     */
    val numbers = arrayOf(1,2,3,4,5)
    val name = arrayOf("1","2","3","4",5, 6.34) //we haven't given any type of array
    val nameString = arrayOf<String>("a","b","c","d","e")
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
    //immutable lists
    var listOfNames = listOf<String>("Hello","world","coder","kotlin")
    var mapOfNames = mapOf<Int, String>(0 to "Hello",3 to "world",2 to "coder",7 to "kotlin")
    println(mapOfNames[7])
    var mapOfNames1 = mapOf("name" to "Hello",3.87 to "world",2 to 20,9 to "kotlin")
    var hashMapOfNames = hashMapOf<int,int>(0 to 3, 2 to 7, 4 to 97)
    var hashMapOfNames1 = hashMapOf("name" to "Hello",3.87 to "world",2 to 20,9 to "scene")
//    hashMapOfNames.add()
    
    //to mutate a list
    var mutableListOfNames = mutableListOf<String>("Hi","anubhav","bagri")
    mutableListOfNames.add("Pulkit")
    var mutableArrayListOfNames = arrayListOf<String>("don't know","Yes","No")
}