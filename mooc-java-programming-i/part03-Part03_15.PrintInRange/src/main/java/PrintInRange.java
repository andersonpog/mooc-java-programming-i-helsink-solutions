
import java.util.ArrayList;
import java.util.Scanner;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here

        Scanner scanner = new Scanner(System.in);


    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit){
        System.out.println("The numbers in the range ["+lowerLimit+", "+upperLimit+"]");
        for(int number: numbers)
            if(number>=lowerLimit&&number<=upperLimit)
                System.out.println(number);
    }
    
}
