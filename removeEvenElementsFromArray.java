public class removeEvenElementsFromArray {
    public static void main(String[] args) {
        int arr[] = {3,6,7,2,4,31,21};
        remove obj = new remove(arr);
        int result[] = obj.removeEven(arr);
        System.out.println("Original array");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Resulted array");
        for (int i = 0; i < result.length ; i++) {
            System.out.print(result[i] + " ");
        }
}

}

class remove{
    int arr[];
    remove(int arr[])
    {
        this.arr = arr;
    }
   int[] removeEven(int[] arr)
   {
       int oddCount = 0;
       for (int i = 0; i < arr.length; i++) {
           if(arr[i] % 2 != 0)
           {
               oddCount++;
           }
       }
       int index = 0;
       int resultedArray[] = new int[oddCount];
       for (int i = 0; i < arr.length ; i++) {
           if(arr[i] % 2 != 0)
           {
               resultedArray[index] = arr[i];
               index++;
           }
       }
       return resultedArray;
   }

}