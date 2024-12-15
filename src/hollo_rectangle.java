public class hollo_rectangle {
    public static void main(String[] args) {
       /* int n=4;
        int m=5;
        //Outer loop:
        for (int i=1;i<=n;i++){
            for (int j=1;j<=m;j++ ){
                if (i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }else {
                    System.out.print( " ");
                }
            }
            System.out.println();
        }*/




     /*   int n=4;
        //outer Loop.
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
*/

/*
        int n=4;
        for (int i=1;i<=n;i++){
            // inner loop --> spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        int n=5;
        // Outer loop:
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }

    }
}
