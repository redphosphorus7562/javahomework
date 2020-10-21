public class answer {
    public static void reverse(int num)
    {
        int rev = 0;
        while (num != 0) {
            int pop = num % 10;
            num /= 10;
            rev = rev * 10 + pop;
        }
        System.out.println(rev);
    }
    public static void main(String[] args)
    {
        reverse(123);
    }
}
