import java.util.Scanner;

public class for2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        {
            System.out.println("Enter rows and colm");
            int row = sc.nextInt();
            int col = sc.nextInt();
            for (int i=0;i<row;i++)
            {
                for(int j=0;j<row-i-1;j++)

                {
                    System.out.println(" ");
                }
                for (int j=0;j<=i;j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}