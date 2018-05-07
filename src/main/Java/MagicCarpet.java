public class MagicCarpet extends Ride implements ICheckRide, IRide{


    public MagicCarpet(double price, int minHeight) {
        super(price, minHeight);
    }

    public String addRide(String ride){
        return "adding" + ride + "park";
    }

}
