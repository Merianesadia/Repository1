package Quiz;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {


        Scanner src = new Scanner(System.in);
        System.out.println("Enter First number");
        int x = src.nextInt();//20
        System.out.println("Enter Second number");
        int y = src.nextInt();//30


        if (x>y) {
            System.out.println("the First number are larger");
        }else if(y>x) {
            System.out.println("the second number are larger ");
        }else{
            System.out.println("Both number are equal");

            src.close();
        }

    }

}