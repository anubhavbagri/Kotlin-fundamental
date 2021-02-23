package concurrency

import java.util.concurrent.CopyOnWriteArrayList

//val numberList = ArrayList<Int>()

//Iterating with multiple threads still gives ConcurrentModificationException...
//CopyOnWriteArrayList resolves it

val numberList = CopyOnWriteArrayList<Int>()    //the purpose is all operations are implemented by making a fresh copy of the underlying array
// very costly operation i.e. everytime we are deleting items, its making a copy of the array but its safe from thread-related problems
// because the data getting changed internally, its making a copy of that instead of keeping a reference to that so thus we are
//able to run this dropMultiple function in different threads

fun main(){
    for(i in 0 until 10000){
        numberList.add(i);
    }
    val itr = numberList.iterator()
    Thread{ dropMultiple(3, itr) }.start()
    Thread{ dropMultiple(5, itr) }.start()
    Thread{ dropMultiple(7, itr) }.start()

    for(i in numberList){
        println(i)
    }
}

fun dropMultiple(n: Int, itr: MutableIterator<Int>){
    while (itr.hasNext()){
        val i = itr.next()
        if(i % n == 0){
            itr.remove()
        }
    }
}