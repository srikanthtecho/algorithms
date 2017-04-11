import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Lenovo on 11-04-2017.
 */
public class Fleet {

    public static void main(String args[]) {

        final Scanner scan = new Scanner(System.in);
        final int totalWheels = scan.nextInt();
        final int wheels[] = new int[totalWheels];

        for (int i = 0; i < totalWheels; i++) {
            wheels[i] = scan.nextInt();
        }

        String arrayString = Arrays.toString(chooseFleets(wheels));

        System.out.println(arrayString);
    }

    private static int[] chooseFleets(int[] wheels) {

        int fleet[] = new int[wheels.length];
        int index = 0;
        for (int wheel : wheels) {

            int max = wheel / 4;

            int count = 0;
            for (; max >= 0; max--) {
                final int fourFleet = 4 * max;
                final int leftWheels = wheel - fourFleet;

                final int twoFleet = leftWheels / 2;

                if (twoFleet * 2 + fourFleet == wheel) {
                    count = count + 1;
                }

            }

            fleet[index++] = count;
        }
        return fleet;
    }
}
