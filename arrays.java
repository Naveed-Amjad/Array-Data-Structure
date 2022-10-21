import java.util.Arrays;

public class arrays {
    public static void main(String[] args){
        int data[] = {56,3,58,95,33,63,95,22,7};
        System.out.println(data.length);
        System.out.println(data[2]);
        data[2] = 100;
        System.out.println(data[2]);

        for (int i=0; i < data.length; i++)
        {
            System.out.println(data[i]);
        }


    }
}
