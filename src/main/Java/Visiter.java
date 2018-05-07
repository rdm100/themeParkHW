public class Visiter {
    private int age;
    private int height;
    private double money;
//    Visiter visiter;

    public Visiter(int age, int height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }


    public void payforRide(Ride ride){
        this.money -= ride.getPrice();

    }


}