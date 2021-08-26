package coroutines

//fun main(){
//    runBlocking{
//        println("Start = ${System.currentTimeMillis()}")
//        launch{ task1() }
//        launch{ task2() }
//        println("End = ${System.currentTimeMillis()}")
//    }
//}
//
//private suspend fun task1(){
//    println("Starting task 1 on ${Thread.currentThread().name}")
//    delay(1000)
//    println("Ending task 1 on ${Thread.currentThread().name}")
//}
//
//private suspend fun task2(){
//    println("Starting task 2 on ${Thread.currentThread().name}")
//    delay(1000)
//    println("Ending task 2 on ${Thread.currentThread().name}")
//}