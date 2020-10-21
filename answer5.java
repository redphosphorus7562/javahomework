public class answer5 {
    public static double sumarray(double[][] m)
    {
        int n=m.length;
        double sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=m[i][i];
        }
        return sum;
    }
    public static void main(String[] args)
    {
        double[][] m={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,2,3,4}};
        double a=sumarray(m);
        System.out.println("对角线和为"+a);
    }
}
