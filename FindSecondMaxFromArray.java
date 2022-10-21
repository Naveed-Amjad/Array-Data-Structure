// driver class
public class FindSecondMaxFromArray {
    public static void main(String[] args) {
        int arr[] = {98,4,5,3,3,-9,1,7};
        SecondMax obj = new SecondMax(arr);
        System.out.println("Second Max: "+ obj.findSecondMax());
    }
}

//
class SecondMax{
    int arr[];
    SecondMax(int[] arr)
    {
        this.arr = arr;
    }
    int findSecondMax()
    {
        int firstMax, secondMax;
        firstMax = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > firstMax)
            {
                firstMax = arr[i];
            }
        }
        System.out.println("First max: " + firstMax);
        int firstMaxIndex = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == firstMax)
            {
                firstMaxIndex = i;
            }
        }
        //int temp;
        //temp = arr[0];
        //arr[0] = arr[firstMaxIndex];
        //arr[firstMaxIndex] = temp;
        swap(firstMaxIndex);
        secondMax = arr[1];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] > secondMax)
            {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    void swap(int firstMaxIn)
    {
        int temp = this.arr[0];
        this.arr[0] = this.arr[firstMaxIn];
        this.arr[firstMaxIn] = temp;

    }
}