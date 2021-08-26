package concurrency

val numbList = ArrayList<Int>()

fun main(){
    for(i in 0 until 10000){
        numbList.add(i);
    }
    dropMultiples(3)
    dropMultiples(5)
    dropMultiples(7)

    for(i in numbList){
        println(i)
    }
}

/*fun dropMultiples(n: Int){
//    for(i in numbList)    -> ConcurrentModificationException since if we remove an element, we will have problems in running
// our loop. As soon as we drop an item, iteration will have a problem
    for(i in 0 until numbList.size)
    {
        if(i % n == 0){
            numbList.remove(i)
        }
    }
}*/

//No concurrent modification exception
//Concurrency can happen even if you are iterating a list and you're counting in a for loop
fun dropMultiples(n: Int){
    val itr = numbList.iterator()
    while (itr.hasNext()){
        val i = itr.next()
        if(i % n == 0){
            itr.remove()
        }
    }
}