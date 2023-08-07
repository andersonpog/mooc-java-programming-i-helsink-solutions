
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: "+first);
            System.out.println("Second: "+second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] com = input.split(" ");

            if (com[0].equals("add")){
                int number = Integer.valueOf(com[1]);
                first.add(number);
            }

            if (com[0].equals("move")){
                int number = Integer.valueOf(com[1]);
                if(number>first.contains() ){
                    second.add(first.contains());
                } else{
                    second.add(number);
                }
                first.remove(number);
            }

            if (com[0].equals("remove")){
                int number = Integer.valueOf(com[1]);
                second.remove(number);
            }

        }
    }

}
