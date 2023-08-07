
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        int total = 0;

        try (Scanner scanner1 = new Scanner(Paths.get(file))){
            while (scanner1.hasNextLine()){
                String string = scanner1.nextLine();

                int num = Integer.parseInt(string);

                if(num>=lowerBound&&num<=upperBound)
                    total++;
            }

            System.out.println("Numbers: " + total);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
