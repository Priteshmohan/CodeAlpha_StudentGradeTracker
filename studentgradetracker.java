import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class GradeTrackerConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();
        System.out.println("=== Student Grade Tracker (Console) ===");
        System.out.println("Enter student grades below.");
        System.out.println("Type -1 and press Enter when you are finished.");
        while (true) {
            System.out.print("Enter Grade: ");
            if (scanner.hasNextDouble()) {
                double grade = scanner.nextDouble();
                if (grade == -1) {
                    break; // Stop the loop if user types -1}
                if (grade >= 0 && grade <= 100) {
                    grades.add(grade); // Add valid grade to list [cite: 25]} else {
                    System.out.println("Please enter a valid grade (0-100).");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
        }
        if (grades.isEmpty()) {
            System.out.println("\nNo grades entered.");
        } else {
            double total = 0;
            double highest = grades.get(0);
            double lowest = grades.get(0);

            for (double g : grades) {
                total += g;
                if (g > highest) highest = g; // Find highest [cite: 24]
                if (g < lowest) lowest = g;   // Find lowest [cite: 24]
            }double average = total / grades.size();
            System.out.println("\n--- Performance Report ---");
            System.out.println("Total Students: " + grades.size());
            System.out.println("Highest Score:  " + highest);
            System.out.println("Lowest Score:   " + lowest);
            System.out.printf("Average Score:  %.2f\n", average);}
        scanner.close();}}