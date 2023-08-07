
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int longer = 0;
        int total=0;
        int sum = 0;
        String person="";

        while (true){
            String string = scanner.nextLine();

            if(string.equals(""))
                break;

            String[] pieces = string.split(",");

            sum+=Integer.valueOf(pieces[1]);
            total++;

            if(pieces[0].length()>longer){
                person = pieces[0];
                longer = pieces[0].length();
            }
        }

        System.out.println("Longest name: "+person);
        System.out.println("Average of the birth years: "+(1.0*sum/total));
    }
}
