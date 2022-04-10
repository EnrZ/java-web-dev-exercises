package exercises;
import java.util.Scanner;

public class CalculateMPG {
    public static void main(String[] args) {
        double miles, gallonsOfGas, MPG;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of miles you have driven:");
        miles = input.nextDouble();
        System.out.println("Enter the amount of gas you have consumed(in gallons):");
        gallonsOfGas = input.nextDouble();
        MPG = miles / gallonsOfGas;

        //template literals in java?
        System.out.println("MPG:" + MPG);
    }
}
