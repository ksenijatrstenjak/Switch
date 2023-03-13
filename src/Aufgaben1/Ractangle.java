package Aufgaben1;
/*Rectangle
        Create a new class “Rectangle”. Declare the variables width and length. Both should store an integer value representing the width and length of a rectangle.
        Now declare a third variable: circumference. Calculate the circumference of the rectangle.
        Then declare a fourth variable: area. Calculate the area of the rectangle.
        Write the circumference and the area to the console.
        Convert the functionality of your Rectangle class into 2 methods: calculateCircumference() and calculateArea()! */



public class Ractangle {
    public static void main(String[] args) {

        int width = 1;
        int length = 2;
        int circumference = calculateCircumference(width, length);
        int area = calculateArea(width, length);

        System.out.println("Circumference = " + circumference);
        System.out.println("Area = " + area);

    }

    public static int calculateCircumference(int width, int length) {
        return 2 * width + 2 * length;
    }

    public static int calculateArea (int width, int length) {
        return width * length;
    }
}


