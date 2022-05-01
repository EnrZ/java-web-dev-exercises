package exercises.technology;

public class Main {
    public static void main(String[] args) {

        Computer comp1 = new Computer(10000, 16, "Dell");
        Computer comp2 = new Computer(10000, 16, "HP");
        System.out.println(comp1.toString());
        System.out.println(comp2.toString());

    }
}
