
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
        return this.squares > compared.squares;
    }

    public int priceDifference(Apartment compared){
        int diff = this.princePerSquare*this.squares - compared.princePerSquare*compared.squares;

        if (diff < 0)
            return diff*-1;

        return diff;
    }

    public boolean moreExpensiveThan(Apartment compared){
        return this.princePerSquare*this.squares > compared.princePerSquare*compared.squares;
    }

}
