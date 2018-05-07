import java.util.ArrayList;

public class ThemePark {
    private String name;
    private ArrayList<IRide> rides;
    private int capacity;

    public ThemePark(String name, int capacity){
        this.rides = new ArrayList<IRide>();
        this.name = name;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName(){
        return name;
    }

    public int rideCount(){
        return rides.size();
    }

    public void addRide(IRide ride){
        int spacesLeftFoirDevices = getCapacity() - numberOfRides();
        if (spacesLeftFoirDevices > 0) {
            this.rides.add(ride);
        }
    }

    public void removeRides(){
        rides.clear();
    }

    public int numberOfRides(){
        return this.rides.size();
    }

}
