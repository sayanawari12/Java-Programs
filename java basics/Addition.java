import java.util.Scanner;
public class Addition {
    public static void main(String argu[]){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Any Two Number: ");
 
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        
        int sum = num1 + num2;

        System.out.print("Addition is: "+sum);

        input.close();
    }
    
}
