public class ArrayAddition {
    public static void main(String args[]){
        System.out.println("\n--- Addition of Array Program ---\n");

        int arr[]={10,20,30,40,50};
        int sum = 0;
        for(int i=0; i<arr.length; i++){
             sum = sum + arr[i];
        }
        System.out.print("Addition is: "+sum);

    }
}
