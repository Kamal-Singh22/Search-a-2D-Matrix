import java.util.*;

public class sum {

    public static int calculateSum(int num1,int num2){  // parematers 
        int sum=num1+num2;
        return sum;

       
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calculateSum(a, b);  ///Arguments
        System.out.println("Sum is:"+sum);
        //calculateSum();

        // swap
        int x=5;
        int y=10;

        int temp=x;
        x=y;
        y=temp;
        System.out.println("x: "+x+" y: "+y);
       
    }
    
}
