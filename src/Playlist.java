/**
 * Created by Lenovo on 11-04-2017.
 */
public class Playlist {

    public static void main(String args[]) {

        String[] songs = new String[]{"wheniseeyouagin", "borntorun", "nothingelsematters", "cecelia"};

        int buttonClicks = playlist(songs, 1, "cecelia");

        if (buttonClicks == 2) {
            System.out.println("TEST PASS");
        } else {
            System.out.println("TEST FAIL - Expected output 2 but " + buttonClicks);
        }
    }

    private static int playlist(final String songs[], final int k, final String q) {

        int clockwiseCount = 0;
        int index = k;

        int total = songs.length;
        for (; true; index++) {

            if (index == total) {
                index = 0;
            }

            if (songs[index].equals(q)) {
                break;
            }
            clockwiseCount = clockwiseCount + 1;
        }

        int antiClockwiseCount = 0;
        index = k;
        for (; true; index--) {

            if (songs[index].equals(q)) {
                break;
            }

            if (index == 0) {
                index = total;
            }

            antiClockwiseCount = antiClockwiseCount + 1;
        }

        return Math.min(clockwiseCount, antiClockwiseCount);
    }


}
