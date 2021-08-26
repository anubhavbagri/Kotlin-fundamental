package concurrency

val numList = ArrayList<Int>()

fun main(){
    for(i in 0 until 10000){
        numList.add(i);
    }
    Thread{ printList("1") }.start()
    Thread{ printList("2") }.start()
    Thread{ printList("3") }.start()
}

fun printList(id: String) {
    for(i in 0 until 10000){
//        println(" ${Thread.currentThread().id} $i")
//        println(" $id $i")
    if(id == "2" && i == 500){
        Thread.sleep(100)
    }
        if(i%100 == 0)
        {
            println(" $id $i")
        }
    }
}