
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");

        String file = scanner.nextLine();

        try (Scanner scanner1 = new Scanner(Paths.get(file))){
            while (scanner1.hasNextLine()){
                String string = scanner1.nextLine();

                String[] pieces = string.split(",");

                System.out.print(pieces[0] + ", age: " + pieces[1]);

                if(Integer.parseInt(pieces[1])==1)
                    System.out.println(" year");
                else System.out.println(" years");
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
