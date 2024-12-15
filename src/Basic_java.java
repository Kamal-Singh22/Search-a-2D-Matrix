import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Basic_java {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Enter your Number:");
            int number=sc.nextInt();
            if (number%10==0){
               break;  // terminate the program.
               //continue;  // skip the number and continue running.
            }
            System.out.println("Your number is:"+number);

        }while (true);
    }
}
