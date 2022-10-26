public class moveZeroesToEndOfArray {
    public static void main(String[] args) {
        int arr[] = {0,3,0,2,5,7,0};
        System.out.println("Original array");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        ZeroesToEnd obj = new ZeroesToEnd(arr);
        int resultedArray[] = obj.moveZeroes();
        System.out.println("\nResulted Array");
        for (int i = 0; i < resultedArray.length ; i++) {
            System.out.print(resultedArray[i]+" ");
        }

    }
}
class ZeroesToEnd {
    int arr[];
    ZeroesToEnd(int[] arr)
    {
        this.arr = arr;
    }
    int[] moveZeroes()
    {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] != 0 && arr[j] == 0)
            {
                swap(i,j);
            }
            if (arr[j] != 0)
                j++;
        }
        return this.arr;
        /* I tried  to solve first using below code but it was not working correctly for some cases.*/
//        int start = 0;
//        int end = this.arr.length - 1;
//        while(start < end)
//        {
//            if(this.arr[start] == 0)
//            {
//                if(this.arr[end] == 0)
//                {
//                    end--;
//                }
//                else if(this.arr[end] != 0)
//                {
//                    swap(start,end);
//                    start++;
//                    end--;
//                }
//                else {
//                    end--;
//                }
//            }
//            start++;
//        }
//        return this.arr;
    }
    void swap(int i, int j)
    {
        int temp = this.arr[i];
        this.arr[i] = this.arr[j];
        this.arr[j] = temp;
    }
}