import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Lenovo on 07-04-2017.
 */
public class ModifyPrices {

    public static void main(String args[]) {

        final Map<String, Float> itemsMap = new HashMap<>();
        final Map<String, Float> soldItemsMap = new HashMap<>();

        final Scanner scan = new Scanner(System.in);

        final int totalItems = scan.nextInt();

        final String[] items = new String[totalItems];
        for (int i = 0; i < totalItems; i++) {
            items[i] = scan.next();
        }

        final float[] itemPrices = new float[totalItems];
        for (int i = 0; i < totalItems; i++) {
            itemPrices[i] = scan.nextFloat();
        }

        for (int i = 0; i < totalItems; i++) {
            itemsMap.put(items[i], itemPrices[i]);
        }

        final int soldItemsTotal = scan.nextInt();

        final String[] soldItems = new String[soldItemsTotal];
        for (int i = 0; i < soldItemsTotal; i++) {
            soldItems[i] = scan.next();
        }

        final float[] soldItemsPrices = new float[soldItemsTotal];
        for (int i = 0; i < soldItemsTotal; i++) {
            soldItemsPrices[i] = scan.nextFloat();
        }

        for (int i = 0; i < soldItemsTotal; i++) {
            soldItemsMap.put(soldItems[i], soldItemsPrices[i]);
        }

        int count = 0;
        for (Map.Entry<String, Float> entry : soldItemsMap.entrySet()) {

            String item = entry.getKey();
            Float soldItemPrice = entry.getValue();
            if (soldItemPrice.compareTo(itemsMap.get(item)) != 0) {
                count++;
            }
        }

        System.out.println("Total count " + count);
    }
}