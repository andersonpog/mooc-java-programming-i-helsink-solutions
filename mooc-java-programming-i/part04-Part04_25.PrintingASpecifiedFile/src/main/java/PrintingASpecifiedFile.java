
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Which file should have its contents printed?");

        String file = scanner1.nextLine();

        try (Scanner scanner = new Scanner(Paths.get(file))){
            while (scanner.hasNextLine()){
                String string = scanner.nextLine();

                System.out.println(string);
            }

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
