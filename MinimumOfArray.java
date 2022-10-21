import java.util.Scanner;

public class MinimumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // empty array
        if(arr.length == 0){
            System.out.println("Array is empty");
        }
        // to get the elements of array from user
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter value for ["+i+"]: ");
            arr[i] = sc.nextInt();
        }
        // print array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // to find mimimum element from the array
        int min = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum element of the array: "+ min);

    }
}
