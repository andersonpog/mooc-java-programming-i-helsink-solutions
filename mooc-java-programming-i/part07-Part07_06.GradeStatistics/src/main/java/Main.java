
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.

        ArrayList<Integer> points =  new ArrayList<>();

        System.out.println("Enter point totals, -1 stops:");

        while (true){
            int number = Integer.valueOf(scanner.nextLine());

            if(number==-1)
                break;
            if( number>=0 && number<=100 ){
                points.add(number);
            }

        }

        int sum = 0;

        for(Integer point: points){
            sum+=point;
        }
        System.out.println("Point average (all): "+(1.0*sum/points.size()));

        sum=0;
        int total =0;
        for(Integer point: points){
            if(point>=50){
                sum+=point;
                total+=1;
            }
        }
        if(total>0){
            System.out.println("Point average (passing): "+(1.0*sum/total));
            System.out.println("Pass percentage: "+(100.0*total/points.size()));
        }
        else{
            System.out.println("Point average (passing): -");
            System.out.println("Pass percentage: 0.0");
        }

        System.out.print("5: ");
        printStars(grades(points,90,101));
        System.out.println("");

        System.out.print("4: ");
        printStars(grades(points,80,90));
        System.out.println("");

        System.out.print("3: ");
        printStars(grades(points,70,80));
        System.out.println("");

        System.out.print("2: ");
        printStars(grades(points,60,70));
        System.out.println("");

        System.out.print("1: ");
        printStars(grades(points,50,60));
        System.out.println("");

        System.out.print("0: ");
        printStars(grades(points,0,50));
        System.out.println("");



    }

    public static void printStars(int number){
        for(int i=0;i<number;i++)
            System.out.print("*");
    }

    public static  int grades(ArrayList<Integer> points, int begin, int end){
        int total = 0;

        for(Integer point: points){
            if(point>=begin&&point<end)
                total+=1;
        }

        return total;
    }
}
