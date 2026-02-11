import java.util.Scanner;
class wrappwerclass{
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int a = 10;
        Integer b = a;

        Integer c = 10;
        int d = c;
        System.out.println("the value of  a is variable: "+a);
        System.out.println("the value of  b is variable: "+b);
        System.out.println("the value of  c is variable: "+c);
        System.out.println("the value of  d is variable: "+d);
    }
}
 
 class wrappwerclass2{
    public static void main(String[] args) {
        Scanner scn = new  Scanner(System.in);
        String a ="10";
        int b = Integer.parseInt(a);
        System.out.println("The value of a is String: "+a);
        System.out.println("The value of b is String: "+b);
        
    }
 }