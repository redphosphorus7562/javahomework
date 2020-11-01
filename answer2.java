import java.util.Random;
public class answer2 {
    public static void printmatrix(int n)
    {
        int [][]b=new int[n][n];
        for(int j=0;j<n;j++) {
            int []a=new int[n];
            for (int i = 0; i < n; i++) {
                Random random = new Random();
                if (random.nextBoolean()) {
                    a[i] = 1;
                } else {
                    a[i] = 0;
                }
            }
            b[j]=a;
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        printmatrix(3);
    }
}
