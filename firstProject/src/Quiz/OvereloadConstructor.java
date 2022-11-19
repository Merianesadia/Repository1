package Quiz;

public class OvereloadConstructor {



    int two;
    double three;
    String four;

    public OvereloadConstructor(int two){

        this.two=two;
    }
    public OvereloadConstructor(int two,double three,String four) {

        this.two = two;
        this.three = three;
        this.four = four;
        System.out.println(four);
    }

    public static void main(String[] args) {
        OvereloadConstructor obj = new OvereloadConstructor(10,20,"Hi Amine");
        System.out.println(obj.three);
        System.out.println(obj.two);
    }
}
