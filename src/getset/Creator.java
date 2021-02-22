package getset;

public class Creator {
    public static void main(String[] args) {
        System.out.println("And God said, 'Let there be light'");
        Man adam = new Man();
        Woman eve = new Woman();

//        adam.setName("Adam");
        adam.name = "Adam";
        eve.name = "Eve";
    }
}
