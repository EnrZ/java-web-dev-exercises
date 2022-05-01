package exercises.technology;

public class Computer extends AbstractEntity{
    // computer is my parent class

    private String brand;
    private int ram;
    private int storage;

    public Computer(int storage, int ram, String brand) {
        super();
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;

    }

    public void increaseRAM (int n) {
        this.ram = this.ram + n;
    }

    public void increaseStorage (int x) {
        this.storage = this.storage + x;
    }

    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ID=" + getId() +
                ", brand=" + brand +
                ", ram=" + ram +
                ", storage=" + storage +
                '}';
    }
}

