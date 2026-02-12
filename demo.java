class demo{
    public static void main(String[] args) {
        
        int num1 = 5;
        int num2 = 6;
        if(num1>num2)
        {
            System.out.println(num1+" is greater than "+num2);

        }
        else
        {
            System.out.println(num1+" is  not greater than "+num2);

        }
    }
}


class demo2{
    public static void main(String[] args) {
        int[] numbers={10,30,60,80};
        int target=30;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==target){
                target=numbers[i];
            }
        }
        System.out.println("target:" + target);
    }
}

class demo3{
    public static void main(String[] args) {
        String[] playlist={"song1","song2","song3"};
         String[] playlist1=new String[3];
         playlist1[0]="song1";
         System.out.println(playlist1[0]);
         playlist1[1]="song2";
         System.out.println(playlist1[1]);
          
    }
}