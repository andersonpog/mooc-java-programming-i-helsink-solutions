public class Bird {
    private String name;
    private String latin;
    private int obervation;

    public Bird(String name, String latin){
        this.name = name;
        this.latin = latin;
        this.obervation = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLatin() {
        return latin;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }

    public int getObervation() {
        return obervation;
    }

    public void setObervation(int obervation) {
        this.obervation = obervation;
    }

    public  void observation(){
        this.obervation+=1;
    }

    @Override
    public String toString() {
        return this.name+" ("+this.latin+"): "+this.obervation+" observations";
    }
}
