import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your choice (Circle):");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("Circle")) {
            System.out.println("You have chosen Circle. Please enter the radius:");
            double radius = scanner.nextDouble();
            calculateCircle(radius);
        } else {
            System.out.println("Invalid choice. Please try again.");
        }

        scanner.close();
    }

    public static void calculateCircle(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        double circumference = 2 * Math.PI * radius;

        System.out.println("The area of the circle is: " + area);
        System.out.println("The circumference of the circle is: " + circumference);
    }
}

