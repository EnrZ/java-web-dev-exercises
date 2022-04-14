package org.launchcode.java.studios.areaofacircle;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RosterHashMap {
    public static void main(String[] args) {

        //first inside <> is  key     second is  value
        HashMap<Integer, String> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades changing grades to ID nums
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Integer idNumber = input.nextInt();
                students.put(idNumber, newStudent);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        //see this loop assig 1, not using this part for exer
        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("ID: " + student.getKey() + " Name: " + student.getValue());
        }

    }
}
