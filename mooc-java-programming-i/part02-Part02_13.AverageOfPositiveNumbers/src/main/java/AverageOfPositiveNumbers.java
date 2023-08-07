
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total =0;
        int sum=0;

        while (true){
            System.out.println("Give a number:");

            int input = scanner.nextInt();

            if(input==0){
                break;
            }
            if(input>0){
                sum+=input;
                total++;
            }
        }

        if(sum==0){
            System.out.println("Cannot calculate the average");
        } else{
            System.out.println(1.0*sum/total);
        }

    }
}
