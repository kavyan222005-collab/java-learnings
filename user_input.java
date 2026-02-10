import java.lang.System;
import java.util.Scanner;

class user_input_Int{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        System.out.println("the value of a is: "+a);
    }
}

class user_input_String{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        System.out.println("The value  of  a is: "+name);
    }
}


class user_input_float{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        float f = scn.nextFloat();
        System.out.println("the name is: "+f);

    }
}

class addition_of_two_numbers{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter first number:");
        int a = scn.nextInt();
        System.out.println("enter second number:");
        int b = scn.nextInt();
        int sum = a + b;
        System.out.println("The sum of "+a+" and "+b+" is: "+sum);
    }

}