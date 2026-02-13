import java.util.Scanner;
public class swapping {
    public static void main(String args[]){
        System.out.println("\n---Swapping Two Numbers---\n");

        Scanner input = new Scanner (System.in);

        System.out.print("Enter Any Two Number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int temp;

        System.out.println("---Before Swapping--- :"+num1+num2);

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("---After Swapping--- :"+num1+num2);

        input.close();
    }
}
