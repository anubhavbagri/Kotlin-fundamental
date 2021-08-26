/*
Classes are blueprint of the object which have common properties
 */
fun main(){
    //to create an object of the class User
    val u: User = User()
    u.email
}
//class can contain functions as well as variables so could use them altogether
class User{
    /*
    below are the attributes of the class
     */
    var name: String = ""
    var mobile: Int = 1
    var gender: String = ""
    var email: String = ""
    var bio: String = ""

    fun checkEmail():Boolean{
        return email.isNotEmpty() //checks if email is empty or not
    }

}