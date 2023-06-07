package number26;

import org.junit.Test;
import java.util.Arrays;


public class BubbleSortTest {
    @Test
    public void testSort() {
        String[] data = { "green", "blue", "red" };
        int[] orderValues = { 5, 8, 1 };
        BubbleSort.sort(data, orderValues);
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(orderValues));
    }
}
