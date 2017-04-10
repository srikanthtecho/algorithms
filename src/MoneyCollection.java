import java.util.Scanner;

/**
 * Created by Lenovo on 10-04-2017.
 */
public class MoneyCollection {

    public static void main(String args[]) {

        final Scanner scan = new Scanner(System.in);

        final int n = scan.nextInt();
        final int k = scan.nextInt();

        collectMoney(n, k);

    }

    private static void collectMoney(int n, int k) {

        int count = 0;

        if (k == 1) {
            count = -1;
        }

        for (int i = 1; i <= n; i++) {
            int pCount = count;
            count = count + i;

            if (count == k) {
                count = pCount + 1;
            }

        }
        System.out.println(count);
    }
}
