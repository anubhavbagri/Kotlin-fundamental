 package staticfields;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Human("female",30,"Nancy"));
        System.out.println(Human.STANDARD_MALE);

//        System.out.println(Person.Companion.getSTANDARD_FEMALE());
//        System.out.println(Person.getSTANDARD_FEMALE());
        System.out.println(Person.STANDARD_FEMALE);

    }
}
