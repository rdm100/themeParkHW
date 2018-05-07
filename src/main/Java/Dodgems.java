public class Dodgems extends Ride implements ICheckRide, IRide{


    public Dodgems(double price, int minHeight) {
        super(price, minHeight);
    }

    public String addRide(String ride){
        return "adding" + ride + "park";
    }

}