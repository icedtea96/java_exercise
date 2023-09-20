package MyOwn;

public class Split {
    public static void main(String[] args) {
        String[] originalArray = {"1", "2", "3", "4", "5", "6"};
        String[] pairsArray = new String[originalArray.length / 2];

        for (int i = 0, j = 0; i < originalArray.length; i += 2, j++) {
            if (i + 1 < originalArray.length) {
                pairsArray[j] = originalArray[i] + "," + originalArray[i + 1];
            } else {
                // Handle the case when there's an odd number of elements in the original array
                pairsArray[j] = originalArray[i];
            }
        }

        // Print the resulting pairs array
        for (String pair : pairsArray) {
            System.out.println(pair);
        }
    }
}
