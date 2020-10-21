public class answer3 {
    public static void main(String[] args) {
        int[] a = new int[100];
        int[] counts = new int[10];
        for (int i = 0; i < 10; i++) {
            counts[i] = 0;
        }
        for (int i = 0; i < 100; i++) {
            a[i] = (int) (Math.random() * 10);
            counts[a[i]]++;
        }
        for (int i = 0; i < 10; i++)
            System.out.print(counts[i] + " ");

    }
}
