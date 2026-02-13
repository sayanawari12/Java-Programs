import java.util.Scanner;
public class floatMul{
    public static void main(String args[]){
        System.out.print("\n---Float multiplication---\n");
        Scanner input = new Scanner (System.in);

        System.out.print("Enter any two floating point number: ");
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        float sum = 0;

        sum = num1 * num2;

        System.out.print("Float Multiplication is: "+sum);

        input.close();
    }
}