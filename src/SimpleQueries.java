/**
 * Created by Lenovo on 11-04-2017.
 */
public class SimpleQueries {

    public static void main(String args[]) {

        int num[] = new int[]{1, 4, 2, 4};
        int maxes[] = new int[]{3, 5};

        int[] results = simpleQueries(num, maxes);

        if(results[0] == 2 && results[1] == 4) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL expected 2 and 4 but found " + results[0] + "and" + results[1]);
        }

    }

    private static int[] simpleQueries(int nums[], int maxes[]) {

        int results[] = new int[nums.length];

        int index = 0;
        for (final int max : maxes) {
            int count = 0;
            for (final int  num : nums) {

                if (max >= num) {
                    count = count + 1;
                }
            }
            if (count > 0) {
                results[index++] = count;
            }

        }
        return results;
    }
}
