## Output your name and age

> We have to print our name and age using Kotlin In-Built Function.

```kotlin
/**
 *This is the main function
 */
fun main(args: Array<String>) {
    
    //Creating variables of Name and Age which is String & int respectively
    
    var name = "Anubhav Bagri"
  	var age = 19
    
    //To print anything we can use print() function
    //To print something and add a new line after it we use println() function
    //
    println("Name: ${name}")
    print("Age: ${age}")
}
```

## Take the same inputs from your user
> Use readLine() method or Scanner class to take inputs from the user.

```kotlin
import java.util.*;
/**
 *This is the main function
 */
fun main(args: Array<String>) {
    
    //Taking input from user using readLine() function
    //We can also use Scanner class after importing from java.util package
    
    //!! for null safety
    
    println("Enter your name")
    var name = readLine()!!
    var read = Scanner(System.`in`)
    
    println("Enter your age")
  	var age = read.nextInt()
    
}
```











