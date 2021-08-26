package staticfields

class Person (
    val gender: String,
    val age: Int,
    val name: String
)   {
    override fun toString(): String {
        return "Person(gender='$gender', age=$age, name='$name')"
    }

    companion object{
        @JvmField
        val STANDARD_MALE = Person("male",18,"John Doe")

        @JvmField
        val STANDARD_FEMALE = Person("female",18,"Jane Doe")

    }
}