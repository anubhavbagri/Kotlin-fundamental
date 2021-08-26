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

## Take the same inputs from the user and display it
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
    
    //To print anything we can use print() function
    //To print something and add a new line after it we use println() function
   
    println("Name: ${name}")
    print("Age: ${age}")
    
}
```

## Use the input for age taken by user and check if user is greater than 18 -> print valid
> Given the input, use conditional statements to check the eligibility.

```kotlin
import java.util.*;
/**
 *This is the main function
 */
fun main(args: Array<String>) {
    
   // Taking input from user using readLine() function
   // We can also use Scanner class after importing from java.util package
    
    var read = Scanner(System.`in`)
    
    println("Enter your age")
  	var age = read.nextInt()
    
    print("Age: ${age}")
    
    /*
     * Checking age with if else
     */
     if(age>18){
         println("Valid age")
     }else{
         println("Not valid")
     }   
}
```

## Take inputs for two users and store the details of the elder one
> Use if-else as an expression here and make use of another variable to store the older age.

```kotlin
import java.util.*;
/**
 *This is the main function
 */
fun main(args: Array<String>) {
    
    var read = Scanner(System.`in`)
    
    println("Enter first persons age")
  	var age1 = read.nextInt()
    
    println("Enter second persons age")
  	var age2 = read.nextInt()
    
    var elder = if(age1>age2) age1 else age2
    
    println("Older age: $elder")
}
```

## Do the same with a when expression
> Can we do the same but with using a when expression?

``` kotlin
import java.util.*;
/**
 *This is the main function
 */
fun main(args: Array<String>) { 
    var read = Scanner(System.`in`)
    
    println("Enter your age")
  	var age = read.nextInt()
    
    /*
     * Checking age with when
     */
     
     when(age){
         in 1..17 -> println("You are below 18")
         in 18..80 -> println("You are above 18")
         else -> {
             println("Not in range")
         }
     }   
}
```




