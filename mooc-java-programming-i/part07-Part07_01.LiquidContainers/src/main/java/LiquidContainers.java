
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;


        while (true) {
//            System.out.print("> ");
            System.out.println("First: "+first+"/100");
            System.out.println("Second: "+second+"/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] com = input.split(" ");

            if (com[0].equals("add")){
                int number = Integer.valueOf(com[1]);
                if(number<0)
                    continue;
                first+= number;
                if(first>100)
                    first = 100;
            }

            if (com[0].equals("move")){
                int number = Integer.valueOf(com[1]);
                if(number<0)
                    continue;
                if(number>first){
                    second+=first;
                    first = 0;
                } else{
                    second+=number;
                    first-=number;
                }

                if(second>100)
                    second = 100;
            }

            if (com[0].equals("remove")){
                int number = Integer.valueOf(com[1]);
                if(number<0)
                    continue;
                second-= number;
                if(second<0)
                    second=0;
            }

        }
    }

}
