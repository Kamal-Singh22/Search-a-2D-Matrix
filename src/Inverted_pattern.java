import javax.swing.plaf.IconUIResource;

public class Inverted_pattern {
   /* public static void inverted_pattern(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<n-i+1;j++){
                System.out.print(j);

            }
            System.out.println();
        }
    }*/

/*
    public static void traingle(int n){
        int counter=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }*/



    public static void rhombus(int n){

        //outer Loop
        for (int i=1;i<=n;i++){

            //Inner Loop
            for(int j=1;j<=(n-i);j++) {
                System.out.print(" ");
            }
                for (int j=1;j<=n;j++){
                    System.out.print("*");

                }
                System.out.println();


        }
    }




    public static void main(String[] args) {
        //inverted_pattern(5);
        //traingle(5);
        rhombus(8);

    }
}
