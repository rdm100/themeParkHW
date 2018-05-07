public class Rollercoaster extends Ride implements ICheckRide, IRide {


    public Rollercoaster(double price, int minHeight) {
        super(price, minHeight);
    }

    public String addRide(String ride){
        return "adding" + ride + "park";
    }

}
