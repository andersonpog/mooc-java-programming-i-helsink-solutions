import java.util.ArrayList;

public class Hold {

    private int max;
    private int weight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int max){
        this.max = max;
        this.weight = 0;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase){
        if(this.weight + suitcase.totalWeight() <= this.max){
            this.suitcases.add(suitcase);
            this.weight = this.weight + suitcase.totalWeight();
        }
    }

    public String toString(){
//        if(this.suitcases.isEmpty())
//            return "no items (0 kg)";
//
//        if(this.items.size()==1)
//            return "1 item (" + this.weight + " kg)";

        return this.suitcases.size() + " suitcases (" + this.weight + " kg)";
    }

    public void printItems(){
        for(Suitcase suitcase: this.suitcases)
            suitcase.printItems();
    }
}
