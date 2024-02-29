import java.util.Scanner;
import java.util.Arrays;

public class SpiralMatrix {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];
        
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
    
        int currVal = 1;

        while(top <= bottom && left <= right) {
            
            for(int i = left; i <= right; i++)
            {
                a[top][i] = currVal++;
            }
            
            top++;

            for(int i = top; i <= bottom; i++)
            {
                a[i][right] = currVal++;
            }

            right--;

            for(int i = right; i >= left; i--) {
                a[bottom][i] = currVal++;
            }
            
            bottom--;

            for(int i = bottom; i >= top; i--)
            {
                a[i][left] = currVal++;
            }

            left++;


        }

        for(int i = 0; i < n; i++)
            System.out.println(Arrays.toString(a[i]));
        
    }
}
