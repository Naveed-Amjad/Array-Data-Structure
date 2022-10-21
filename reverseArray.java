import java.util.Scanner;
import java.util.Stack;

public class reverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length ; i++) {
            System.out.print("Enter value for ["+i+"]: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Reversed array");
        reverse obj = new reverse(arr);
        int[] reversedArray = obj.reverseElement();
        for (int i = 0; i < reversedArray.length ; i++) {
            System.out.print(reversedArray[i]+" ");
        }

        // This stack method is only print the reversed array but the original array remains the same
//        Stack s = new Stack();
//        for (int i = 0; i < arr.length; i++) {
//            s.push(arr[i]);
//        }
//        System.out.println("Reversed array: ");
//        while ( !s.empty())
//        {
//            System.out.println(s.pop());
//        }
//        System.out.println(arr[0]);
    }
}
class reverse{
    int reversedArray[];
    reverse(int[] arr)
    {
        this.reversedArray = arr;
    }
    void swap(int[] arr, int start, int end)
    {
        int temp;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    int[] reverseElement()
    {
        //int start = reversedArray[0];
        //int end = reversedArray[reversedArray.length - 1];
        int start = 0;
        int end = reversedArray.length - 1;
        while(start < end)
        {
            swap(reversedArray,start,end);
            start++;
            end--;
        }
        return reversedArray;
    }

    // using stack method
}