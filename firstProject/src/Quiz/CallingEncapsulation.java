package Quiz;

public class CallingEncapsulation {

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();

        obj.setUsername("merianesadia");
        System.out.println(obj.getUsername());
        obj.setPassword("****");
        System.out.println(obj.getPassword());
    }
}
