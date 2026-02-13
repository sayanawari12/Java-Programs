import java.util.Scanner;
public class Rectangle{
public static void main(String args[]){
    System.out.println("\n***Find Area Of Rectangle***\n");
    Scanner input = new Scanner(System.in);

    int area;
    int length;
    int width;

    System.out.println("Enter Length And Width: ");
     width = input.nextInt();
     length = input.nextInt();

     area = length * width;

     System.out.println("Area of Rectangle is: "+area);

     input.close();
}
}