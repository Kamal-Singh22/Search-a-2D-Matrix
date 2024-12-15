public class Do_while_loop {
    public static void main(String[] args) {
        int counter=1;
        do {
            System.out.println(counter);
            counter++;
            if (counter==5){
                break;
            }

        }while (counter<=10);
    }


}
