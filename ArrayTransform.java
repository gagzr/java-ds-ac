import java.util.Scanner;
import java.util.Arrays;

public class ArrayTransform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        sc.close();

        int rem = a[0] % k;
        for (int i = 1; i < n; i++) {
            if (a[i] % k != rem) {
                System.out.println("-1");
                return;
            }
        }

        Arrays.sort(a);
        int median = a[n / 2];
        long ops = 0;
        for (int i = 0; i < n; i++) {
            ops += Math.abs((long) a[i] - median) / k;
        }

        System.out.println(ops);
    }
}
