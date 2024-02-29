import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements one by one: ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of rotations: ");
        int r = sc.nextInt();

        System.out.println("Original array: ");
        System.out.println(Arrays.toString(arr));

        for(int i = 1; i <= r % n; i++) {
            rotate(arr);
        }
        
        System.out.println(r + " times rotated array:");    
        System.out.println(Arrays.toString(arr));

    }

    static void rotate(int[] arr)
    {
        int temp = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            arr[i - 1] = arr[i];
        }
        
        arr[arr.length - 1] = temp;
    }
}
