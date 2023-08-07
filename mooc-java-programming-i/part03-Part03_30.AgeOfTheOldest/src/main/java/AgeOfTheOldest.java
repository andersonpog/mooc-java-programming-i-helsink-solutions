
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int older = 0;

        while (true){
            String string = scanner.nextLine();

            if(string.equals(""))
                break;

            String[] pieces = string.split(",");

            if(Integer.valueOf(pieces[1])>older)
                older=Integer.valueOf(pieces[1]);
        }

        System.out.println("Age of the oldest: "+older);

    }
}
