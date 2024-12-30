import java.util.Scanner;
public class MDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] a = new int[row][col];
        int[][] b = new int[row][col];
        int[][] c = new int[row][col];
        System.out.println("Enter element for 1st matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                a[i][j] = sc.nextInt();
        }
        System.out.println("Enter element for 2nd matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
                b[i][j] = sc.nextInt();
        }
        System.out.println("Sum of 2 matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
            for(int i=0;i<row;i++)
            {
                for (int j=0;j<col;j++)
                {
                    System.out.println(c[i][j]);
                }
            }
    }
}