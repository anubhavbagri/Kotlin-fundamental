package coroutines

// import kotlinx.coroutines.*
//
// fun main()
// {
// runBlocking{
// launch{ printListSuspend("1")}
// launch{ printListSuspend("2")}
// launch{ printListSuspend("3")}
// launch{ printListSuspend("4")}
// launch{ printListSuspend("5")}
// launch{ printListSuspend("6")}
// launch{ printListSuspend("7")}
// launch{ printListSuspend("8")}
// launch{ printListSuspend("9")}
// launch{ printListSuspend("10")}
// launch{ printListSuspend("11")}
// launch{ printListSuspend("12")}
//
// }
// }
//
// suspend fun printListSuspend(id: String)
// {
// for(i in 0 until 10000){
// if(i % 1000 == 0){
// withContext(Dispatchers.IO){
// println("looper $id iteration $i thread ${Thread.currentThread().name}")
// }
// }
// }
// }