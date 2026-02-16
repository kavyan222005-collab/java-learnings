class Exception{
    public static void main(String[] args){
        int a = 10;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero" + e.getMessage());
        }
        System.out.println("program contininues after handling the exception.");

    }
}
class Exception2{
    public static void main(String[] args){
        String str = null;
        try{
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println("cannot call method  on a null object:"+e.getMessage());      
    }
    System.out.println("program continous after handling the exception.");
    }
}

class Exception4{
    public static void main(String[] args){
        String str= "abc";
        try{
            int num = Integer.parseInt(str);
            System.out.println(num);
        }
        catch(NumberFormatException e){
            System.out.println("cannot convert string to integer:"+e.getMessage());      
    }
    System.out.println("program continous after handling the exception.");
    }
}

class Exception5{
    public static void main(String[] args){
        try{
            int result=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("caught an arithmetic eception:" + e.getMessage() );
        }
        finally{
            System.out.println("this block will always execute.");
        }
        System.out.println("program  continues after handling the exception.");
    
}
}




class ExceptionThrow {
    public static void main(String[] args) {
        int a = -1;

        try {
            if (a < 0) {
                throw new IllegalArgumentException("Negative number is not allowed: " + a);
            }

            System.out.println("Value is: " + a);

        } catch (IllegalArgumentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}


