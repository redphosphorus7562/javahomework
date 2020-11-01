import java.util.Scanner;
public class answer4 {
    public static int indexof(double[] array)
    {
        double min=array[0];
        int n=0;
        for (int i=0;i<10;i++)
        {
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        int index=0;
        for (int i=0;i<10;i++)
        {
            if(array[i]==min)
            {
                index= i;

            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] a = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("输入数字：");
            a[i] = scanner.nextDouble();
        }
        int x=indexof(a);
        System.out.println("最小值下标是"+x);
    }
}
