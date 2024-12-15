import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
    int n;
    int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of N:");
        n=sc.nextInt();
        int i=1;
        while(i<=n){
            sum+=i;

            i++;
        }
        System.out.println("Sum is: "+sum);
    }

}
