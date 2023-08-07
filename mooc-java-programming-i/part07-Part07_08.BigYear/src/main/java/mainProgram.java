
import java.util.ArrayList;
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scan = new Scanner(System.in);

        ArrayList<Bird> birds = new ArrayList<>();

        while (true){
            System.out.print("? ");
            String command = scan.nextLine();

            if(command.equals("Quit")){
                break;
            }

            if(command.equals("Add")){
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latin = scan.nextLine();

                Bird bird = new Bird(name,latin);
                birds.add(bird);
            }

            if(command.equals("Observation")){
                System.out.print("Bird? ");
                String name = scan.nextLine();

                boolean find = false;

                for(Bird bird: birds){
                    if(bird.getName().equals(name)){
                        bird.observation();
                        find = true;
                    }
                }

                if(!find)
                    System.out.println("Not a bird!");
            }

            if(command.equals("One")){
                System.out.print("Bird? ");
                String name = scan.nextLine();

                boolean find = false;

                for(Bird bird: birds){
                    if(bird.getName().equals(name)){
                        System.out.println(bird);
                    }
                }

                if(!find)
                    System.out.println("Not a bird!");
            }

            if(command.equals("All")){
                for(Bird bird: birds)
                    System.out.println(bird);
            }
        }

    }

}
