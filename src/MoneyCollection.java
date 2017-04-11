import java.util.Scanner;

/**
 * Created by Lenovo on 10-04-2017.
 */
public class MoneyCollection {

    public static void main(String args[]) {


        // Test 1
        int money = collectMoney(2, 2);

        if(money == 3) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }

        // Test 2
        int money2 = collectMoney(2, 1);

        if(money2 == 2) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }

        // Test 3
        int money3 = collectMoney(3, 3);

        if(money3 == 5) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }

    }

    private static int collectMoney(int n, int k) {

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
        return count;
    }
}
