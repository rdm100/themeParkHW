public abstract class Ride {

    private double price;
    private int minHeight;


    public Ride(double price, int minHeight) {
        this.price = price;
        this.minHeight = minHeight;
    }

    public double getPrice() {
        return price;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public boolean checkTallEnough(Visiter visiter) {
        return visiter.getHeight() >= this.minHeight;
    }

    public boolean checkHasMoney(Visiter visiter){
        return visiter.getMoney() >= this.price;
    }

    public boolean checkRide(Visiter visiter){
        return (checkTallEnough(visiter) && checkHasMoney(visiter));
    }


}
