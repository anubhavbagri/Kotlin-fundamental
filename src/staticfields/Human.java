 package staticfields;

public class Human {
    String gender;
    int age;
    String name;

    public Human(String gender, int age, String name) {
        this.gender = gender;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "gender='" + gender + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    //one of use cases of having static final constants in your code
    public static final Human STANDARD_MALE = new Human("male",18,"John Doe");
    public static final Human STANDARD_FEMALE = new Human("female",18,"Jane Doe");

}
