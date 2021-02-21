//if you want to change what is gonna be the filename of this kotlin file when it gets converted to java bytecode,then add the below:
@file:JvmName("Fifth")  //file decoration
import java.util.*

fun greeter(name: String): String{
    val cal = Calendar.getInstance()
    if(cal.get(Calendar.HOUR_OF_DAY) < 12){
        return "Good morning $name"
    }
    if(cal.get(Calendar.HOUR_OF_DAY) < 18){
        return "Good evening $name"
    }
    return "Good Night $name"
}