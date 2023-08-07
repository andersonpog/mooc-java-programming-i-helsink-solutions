import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int max;
    private int weight;

    public Suitcase(int max){
        this.items = new ArrayList<>();
        this.max = max;
        this.weight = 0;
    }

    public void addItem(Item item){
        if(this.weight + item.getWeight() <= this.max){
            this.items.add(item);
            this.weight = this.weight + item.getWeight();

        }
    }

    public String toString(){

        if(this.items.isEmpty())
            return "no items (0 kg)";

        if(this.items.size()==1)
            return "1 item (" + this.weight + " kg)";

        return this.items.size() + " items (" + this.weight + " kg)";
    }

    public void printItems(){
        for(Item item: this.items)
            System.out.println(item);
    }

    public int totalWeight(){
        return this.weight;
    }

    public Item heaviestItem(){
        if(this.items.isEmpty())
            return null;

        Item string = items.get(0);

        for(Item elem: this.items){
            if(string.getWeight()<elem.getWeight())
                string = elem;
        }

        return string;
    }

}
