import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dic;

    public TextUI(Scanner scanner, SimpleDictionary dic){
        this.scanner = scanner;
        this.dic = dic;
    }

    public void start(){
        while (true){
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }

            if(command.equals("add")){
                System.out.print("Word: ");
                String word = scanner.nextLine();

                System.out.print("Translation: ");
                String translation = scanner.nextLine();

                this.dic.add(word,translation);

            }

            if(command.equals("search")){
                System.out.print("To be translated: ");
                String word = scanner.nextLine();

                String translate = this.dic.translate(word);

                if(translate==null){
                    System.out.println("Word "+ word +" was not found");
                } else {
                    System.out.println("Translation: "+translate);
                }


            }

            System.out.println("Unknown command");

        }
    }
}
