import java.util.Scanner;


public class TriangleArea {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        // Taking input

        System.out.print("Enter base in cm: ");

        double base = sc.nextDouble();


        System.out.print("Enter height in cm: ");

        double height = sc.nextDouble();


        // Calculating area in square cm

        double areaSqCm = 0.5 * base * height;


        // Converting to square inches

        double areaSqIn = areaSqCm / 6.4516;


        // Printing result

        System.out.println("The Area of the triangle in sq in is "

                + areaSqIn + " and sq cm is " + areaSqCm);


        sc.close();

    }

}

