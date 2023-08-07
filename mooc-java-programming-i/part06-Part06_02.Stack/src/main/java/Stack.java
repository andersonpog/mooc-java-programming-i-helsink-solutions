import java.util.ArrayList;

public class Stack {

    private ArrayList<String> meals;

    public Stack() {
        this.meals = new ArrayList<>();
    }

    public boolean isEmpty(){
        return this.meals.isEmpty();
    }

    public void add(String value){
        this.meals.add(value);
    }

    public ArrayList<String> values(){
        return this.meals;
    }

    public String take(){
        String info = this.meals.get(this.meals.size()-1);
        this.meals.remove(this.meals.size()-1);
        return info;
    }
}
