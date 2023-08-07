import java.util.Scanner;

public class UserInterface {

    private TodoList todo;
    private Scanner scanner;
    public UserInterface(TodoList todo, Scanner scanner){
        this.todo = todo;
        this.scanner = scanner;
    }

    public void start(){
        while (true){
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            if(command.equals("stop")){
                break;
            }

            if(command.equals("add")){
                System.out.print("To add: ");
                String word = this.scanner.nextLine();

                this.todo.add(word);

            }

            if(command.equals("list")){
                this.todo.print();
            }

            if(command.equals("remove")){
                System.out.print("Which one is removed? ");
                String word = this.scanner.nextLine();

                this.todo.remove(Integer.valueOf(word));

            }
        }
    }
}
