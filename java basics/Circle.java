import java.util.Scanner;
public class Circle {
 public static void main(String args[]){
    System.out.println("\n***Find Area of Circle***\n");
    Scanner input = new Scanner (System.in);

    System.out.print("Enter the Redius: ");
    float area;
    float redius = input.nextFloat();

    area = 3.14f * redius * redius;
    
    System.out.println("Area of Circle :"+area);

    input.close();
 }   
}
