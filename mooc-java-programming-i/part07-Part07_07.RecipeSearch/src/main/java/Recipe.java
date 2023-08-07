import java.util.ArrayList;

public class Recipe {

    private String name;
    private int time;
    private ArrayList<String> ingredients;

    public Recipe(String name, int time){
        this.name = name;
        this.time = time;
        this.ingredients = new ArrayList<>();
    }

    public void add(String ingredient){
        this.ingredients.add(ingredient);
    }

    public boolean contains(String ingredient){
        for(String in: this.ingredients)
            if(in.equals(ingredient))
                return true;
        return false;
    }

    @Override
    public String toString() {
        return this.name + ", cooking time: " + this.time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<String> ingredients) {
        this.ingredients = ingredients;
    }
}
