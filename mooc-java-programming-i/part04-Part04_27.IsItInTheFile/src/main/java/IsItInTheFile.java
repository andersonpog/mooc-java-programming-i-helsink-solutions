
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner scanner1 = new Scanner(Paths.get(file))){
            boolean find = false;
            while (scanner1.hasNextLine()){
                String string = scanner1.nextLine();

                if(string.equals(searchedFor)){
                    find = true;
                    System.out.println("Found!");
                    break;
                }
            }

            if(!find)
                System.out.println("Not found.");

        } catch (Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
