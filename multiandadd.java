FoR ADDITION
package matrix;
 
import java.util.Scanner;
public class MatrixAddition {
 
    public static void main(String...args) {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter number of rows in matrix : "); //rows and columns in matrix1 and matrix2 must be same for addition.
           int rows = scanner.nextInt();
           System.out.print("Enter number of columns in matrix : ");
           int columns = scanner.nextInt();
           int[][] matrix1 = new int[rows][columns];
           int[][] matrix2 = new int[rows][columns];
           
           System.out.println("Enter the elements in first matrix :");
           for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < columns; j++) {
                        matrix1[i][j] = scanner.nextInt();
                  }
           }
           System.out.println("Enter the elements in second matrix :");
           for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < columns; j++) {
                        matrix2[i][j] = scanner.nextInt();
                  }
           }
           
           //addition of matrices.
           int[][] resultMatix = new int[rows][columns];
           for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < columns; j++) {
                        resultMatix[i][j] = matrix1[i][j] + matrix2[i][j];
                  }
           }
 
           System.out.println("\nFirst matrix is : ");
           for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < columns; j++) {
                        System.out.print(matrix1[i][j] + " ");
                  }
                  System.out.println();
           }
 
           System.out.println("\nSecond matrix is : ");
           for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < columns; j++) {
                        System.out.print(matrix2[i][j] + " ");
                  }
                  System.out.println();
           }
 
           System.out.println("\nThe sum of the two matrices is : ");
           for (int i = 0; i < rows; i++) {
                  for (int j = 0; j < columns; j++) {
                        System.out.print(resultMatix[i][j] + " ");
                  }
                  System.out.println();
           }
    }
}

For MULTIPLICATION
package matrix
import java.util.Scanner;

public class MatrixMultiplication {
 
       public static void main(String...args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of rows in first matrix : ");
        int rowsMatrix1 = scanner.nextInt();
        System.out.print("Enter number of columns in first matrix / rows in matrix2: ");
        int columnsMatrix1RowsMatrix2 = scanner.nextInt();         //variable name used for understanding convenience, because columns in matrix1 = rows in matrix2
        System.out.print("Enter number of columns in second matrix : ");
        int columnsMatrix2 = scanner.nextInt();
        
        int[][] matrix1 = new int[rowsMatrix1][columnsMatrix1RowsMatrix2];
        int[][] matrix2 = new int[columnsMatrix1RowsMatrix2][columnsMatrix2];
        System.out.println("Enter the first matrix in elements :");
           for (int[] matrix11 : matrix1) {
               for (int j = 0; j < matrix1[0].length; j++) {
                   matrix11[j] = scanner.nextInt();
               }
           }
        
        System.out.println("Enter the second matrix elements:");
           for (int[] matrix21 : matrix2) {
               for (int j = 0; j < matrix2[0].length; j++) {
                   matrix21[j] = scanner.nextInt();
               }
           }
        
        
        //Multiply matrices
        int[][] productMatrix  = new int[rowsMatrix1][columnsMatrix2];
        for (int i = 0; i < rowsMatrix1; i++) {
            for (int j = 0; j < columnsMatrix2; j++) {
                for (int k = 0; k < columnsMatrix1RowsMatrix2; k++) { //columns in matrix1= rows in matrix2
                    productMatrix[i][j] = productMatrix[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }
 
        
 
                  System.out.println("\nFirst matrix is : ");
                  for (int i = 0; i < rowsMatrix1; i++) {
                        for (int j = 0; j < columnsMatrix1RowsMatrix2; j++) {
                               System.out.print(matrix1[i][j] + " ");
                        }
                        System.out.println();
                  }
 
                  System.out.println("\nSecond matrix is : ");
                  for (int i = 0; i < columnsMatrix1RowsMatrix2; i++) {
                        for (int j = 0; j < columnsMatrix2; j++) {
                               System.out.print(matrix2[i][j] + " ");
                        }
                        System.out.println();
                  }
 
                  
        System.out.println("\nProduct of matrix1 and matrix2 is");
        for (int i = 0; i < rowsMatrix1; i++) {
            for (int j = 0; j < columnsMatrix2; j++) {
                System.out.print(productMatrix[i][j] + " ");
            }
            System.out.println();
        }
       }
 
    }
