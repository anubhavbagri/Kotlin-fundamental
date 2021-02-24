package coroutines

fun main()
{
    Thread{ printL("1")}.start()
    Thread{ printL("2")}.start()
    Thread{ printL("3")}.start()
    Thread{ printL("4")}.start()
    Thread{ printL("5")}.start()
    Thread{ printL("6")}.start()
    Thread{ printL("7")}.start()
    Thread{ printL("8")}.start()
    Thread{ printL("9")}.start()
    Thread{ printL("10")}.start()
    Thread{ printL("11")}.start()
    Thread{ printL("12")}.start()


}

fun printL(id: String){
    for(i in 0 until 10000){
        if(i % 1000 == 0){
            println("looper $id iteration $i thread ${Thread.currentThread().name}")
        }
    }
}