public class Song {
    private String name;
    private int lenght;

    public Song(String name, int length){
        this.name = name;
        this.lenght = length;
    }

    public String name(){
        return this.name;
    }

    public int length(){
        return this.lenght;
    }
}
