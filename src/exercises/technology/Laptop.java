package exercises.technology;

public class Laptop extends Computer {

    private double weight; // laptop weight in pounds.

    public Laptop(int storage, int ram, String brand, double weight) {
        super(storage, ram, brand);
        this.weight = weight;
    }

    public boolean isClunky() {
        if (weight > 5.0) {
            return true;
        }
        else {
            return false;
        }
    }
}
