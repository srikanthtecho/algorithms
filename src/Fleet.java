import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Lenovo on 11-04-2017.
 */
public class Fleet {

    public static void main(String args[]) {

        final int[] wheels = new int[]{6, 3,2};
        final int[] fleets = chooseFleets(wheels);

        if(fleets[0] == 2 && fleets[1] == 0 && fleets[2] == 1 ) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL");
        }
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
