
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Recipe> recipes = new ArrayList<>();

        System.out.print("File to read: ");
        String file = scanner.nextLine();

        try (Scanner scanner1 = new Scanner(Paths.get(file))){
            while (scanner1.hasNextLine()){
                String name = scanner1.nextLine();
                String time = scanner1.nextLine();

                Recipe recipe = new Recipe(name,Integer.valueOf(time));

                String ingredient = scanner1.nextLine();
                recipe.add(ingredient);

                while (scanner1.hasNextLine()){
                    ingredient = scanner1.nextLine();
                    if(ingredient.equals(""))
                        break;
                    recipe.add(ingredient);
                }

                recipes.add(recipe);
            }


        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("Commands:\n" +
                "list - lists the recipes\n" +
                "stop - stops the program\n" +
                "find name - searches recipes by name\n" +
                "find cooking time - searches recipes by cooking time\n" +
                "find ingredient - searches recipes by ingredient");

        while (true){
            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if(command.equals("stop"))
                break;

            if(command.equals("list")){
                System.out.println("Recipes:");
                for(Recipe recipe: recipes)
                    System.out.println(recipe);
            }

            if(command.equals("find name")){
                System.out.print("Searched word: ");
                String word = scanner.nextLine();

                for(Recipe recipe: recipes){
                    if(recipe.getName().contains(word))
                        System.out.println(recipe);
                }
            }

            if(command.equals("find cooking time")){
                System.out.print("Max cooking time: ");
                String word = scanner.nextLine();

                int time = Integer.valueOf(word);

                for(Recipe recipe: recipes){
                    if(recipe.getTime()<=time)
                        System.out.println(recipe);
                }
            }

            if(command.equals("find ingredient")){
                System.out.print("Ingredient: ");
                String word = scanner.nextLine();


                for(Recipe recipe: recipes){
                    if(recipe.contains(word))
                        System.out.println(recipe);
                }
            }

        }

    }

}
