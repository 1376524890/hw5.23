import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter three sides of the triangle
        System.out.print("Enter three sides of the triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        // Prompt the user to enter a color
        System.out.print("Enter a color: ");
        String color = input.next();

        // Prompt the user to enter whether the triangle is filled
        System.out.print("Is the triangle filled? (true/false): ");
        boolean filled = input.nextBoolean();

        // Create a Triangle object with the user input
        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        // Display the triangle's area, perimeter, color, and filled status
        System.out.println("The area is " + triangle.getArea());
        System.out.println("The perimeter is " + triangle.getPerimeter());
        System.out.println("The color is " + triangle.getColor());
        System.out.println("The triangle is filled: " + triangle.isFilled());
    }
}
