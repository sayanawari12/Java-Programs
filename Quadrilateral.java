import java.util.Scanner;
public class Quadrilateral {
public static void main(String args[]){
    System.out.print("\n---Perimeter Of Quadrilateral---\n");
    Scanner input = new Scanner (System.in);

    System.out.print("Enter 4 sides in cms: ");

    double a = input.nextDouble();
    double b = input.nextDouble();
    double c = input.nextDouble();
    double d = input.nextDouble();

    double perimeter = a + b + c + d;

    System.out.print("perimeter is: "+perimeter+"cm");

    input.close();
}
}
