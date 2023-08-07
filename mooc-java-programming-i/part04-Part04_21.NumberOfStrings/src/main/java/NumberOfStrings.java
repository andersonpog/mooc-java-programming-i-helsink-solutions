
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;

        while (true){
            String string = scanner.nextLine();
            if(string.equals("end"))
                break;

            total++;
        }

        System.out.println(total);

    }
}
