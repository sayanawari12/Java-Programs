import java.util.Scanner;
public class factorial {
    public static void main(String args[]) {
        System.out.println("\n---Factorial program---\n");
        
        Scanner input = new Scanner (System.in);
        int fact = 1;

         System.out.print("Enter Any One Number: ");
        int num = input.nextInt();

        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        System.out.println(num+" Factorial is : "+fact);

        input.close();

    }
}
