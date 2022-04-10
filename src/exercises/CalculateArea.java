package exercises;
import java.util.Scanner;

public class CalculateArea {
    public static void main(String[] args) {
        double height, width, area;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height of the rectangle to be calculated:");
        height = input.nextDouble();
        System.out.println("Enter the width of the rectangle to be calculated:");
        width = input.nextDouble();
        area = height * width;

        //template literals in java?
        System.out.println("Area:" + area);
    }
}
