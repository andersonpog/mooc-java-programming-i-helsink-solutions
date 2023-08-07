
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int older = 0;
        String olderName="";

        while (true){
            String string = scanner.nextLine();

            if(string.equals(""))
                break;

            String[] pieces = string.split(",");

            if(Integer.valueOf(pieces[1])>older)
            {
                older=Integer.valueOf(pieces[1]);
                olderName=pieces[0];
            }

        }

        System.out.println("Name of the oldest: "+olderName);
    }
}
