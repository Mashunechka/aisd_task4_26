package number26;


public class BubbleSort {
    public static <T> void sort(T[] data, int[] orderValues) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (orderValues[j] > orderValues[j + 1]) {
                    T tempObj = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tempObj;
                    int tempInt = orderValues[j];
                    orderValues[j] = orderValues[j + 1];
                    orderValues[j + 1] = tempInt;
                }
            }
        }
    }
}
