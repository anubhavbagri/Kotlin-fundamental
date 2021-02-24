package coroutines

import kotlin.concurrent.thread

fun main(){
    println("Start = ${System.currentTimeMillis()}")
    thread{ task1 { println("End = ${System.currentTimeMillis()}") } }
    thread { task2 { println("End = ${System.currentTimeMillis()}") } }
}

private fun task1(onEnd: () -> Unit){
    println("Starting task 1 on ${Thread.currentThread().name}")
    Thread.sleep(1000)  //producing delay as thread is sleeping for 1000ms
    println("Ending task 1 on ${Thread.currentThread().name}")
    onEnd()
}

private fun task2(onEnd: () -> Unit){
    println("Starting task 2 on ${Thread.currentThread().name}")
    Thread.sleep(1000)
    println("Ending task 2 on ${Thread.currentThread().name}")
    onEnd()
}