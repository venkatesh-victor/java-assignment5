import java.util.Scanner;
import java.util.Arrays;

public class MatrixMultiplication
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for first matrix: ");
        int aRow = sc.nextInt();

        System.out.print("Enter the number of columns for first matrix: ");
        int aCol = sc.nextInt();

        System.out.print("Enter the number of rows for second matrix: ");
        int bRow= sc.nextInt();

        System.out.print("Enter the number of columns for second matrix: ");
        int bCol = sc.nextInt();

        if(aCol != bRow)
        {
            System.out.println("Number of columns of the first matrix is not equal to the number of rows in the second matrix.");
            System.out.println("Matrix multiplication is impossible for these given matrices.");
            System.exit(0);
        }


        int[][] matrixA = new int[aRow][aCol];
        int[][] matrixB = new int[bRow][bCol];
        
        System.out.println("Enter the elements in the first matrix one by one.");
        for(int i = 0; i < aRow; i++)
            for(int j = 0; j < aCol; j++)
                matrixA[i][j] = sc.nextInt();

        System.out.println("Enter the elements in the second matrix one by one.");
        for(int i = 0; i < bRow; i++)
            for(int j = 0; j < bCol; j++)
                matrixB[i][j] = sc.nextInt();


        int[][] resultMatrix = new int[aRow][bCol];

        for(int i = 0; i < aRow; i++) {
            for(int j = 0; j < bCol; j++) { 
                for(int k = 0; k < aCol; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        System.out.println("The first matrix:");
        for(int i = 0; i < aRow; i++)
            System.out.println(Arrays.toString(matrixA[i]));

        System.out.println("The second matrix:");
        for(int i = 0; i < bRow; i++)
            System.out.println(Arrays.toString(matrixB[i]));

        System.out.println("Multiplicaton of the first and second matrix:");
        for(int i = 0; i < aRow; i++)
            System.out.println(Arrays.toString(resultMatrix[i]));

    }
}
