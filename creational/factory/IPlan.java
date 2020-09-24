package creational.factory;

public abstract class IPlan {
    protected double rate;

    abstract void setRate();

    public double calculateBill(int units) {
        return units * rate;
    }
}
