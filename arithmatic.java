import java.util.Scanner;
public class arithmatic{
public static void main(String arge[]){
    Scanner input = new Scanner (System.in);

    System.out.print("Enter any two numbers: ");
    int num1 = input.nextInt();
    int num2 = input.nextInt();

    System.out.print("Addition is:");
    System.out.println((+num1) + (+num2));
    System.out.print("Subtraction is:");
    System.out.println((+num1) - (+num2));
    System.out.print("Multiplication is:");
    System.out.println((+num1) * (+num2));
    System.out.print("Division is: ");
    System.out.println((+num1) / (+num2));

    input.close();
}
}