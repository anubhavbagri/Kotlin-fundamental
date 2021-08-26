package coroutines

//import javafx.application.Application.launch
//import kotlinx.coroutines.*
//
//val numList = ArrayList<Int>()
//
//fun main(){
//    for(i in 0 until 10000){
//        numList.add(i)
//    }
//
////we can't call suspend functions directly; runBlocking will mean that the main() function will not end till all these have ended
//    runBlocking{
//        launch { printList("1")}
////        async { printList("1")}.await()
//        launch { printList("2")}
//        launch { printList("3")}
//    }
//
//}
//
//suspend fun printList(id: String){
//    for(i in 0 until 10000){
//        if(i % 100 == 0){
//            withContext(Dispatchers.IO){
//                println(" $id $i")
//            }
//        }
//    }
//}