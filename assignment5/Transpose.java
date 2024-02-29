import java.util.Scanner;
import java.util.Arrays;

public class Transpose {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of rows in your matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns in your matrix: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[][] result = new int[cols][rows];
        
        System.out.println("Enter your elements one by one.");
        for(int i = 0; i < rows; i++) 
        {
            for(int j = 0; j < cols; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        sc.close();

        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                result[j][i] = matrix[i][j]
            }
        }

        System.out.println("Your original array:");
        for(int i = 0; i < rows; i++)
        {
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("The transposed array:");
        for(int i = 0; i < result.length; i++)
        {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
