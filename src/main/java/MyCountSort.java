import java.util.Arrays;

public class MyCountSort {
    int[] givenArray;
    int[] supportArray;

    public MyCountSort() {
    }

    public static int[] sort(int[] givenArray) {

        int[] supportArray = new int[checkRange(givenArray)];
        for (int i = 0; i < givenArray.length; i++) {
            givenArray[i] = supportArray[givenArray[i]]++;
        }
        System.out.println("\n  SupportArray" + Arrays.toString(supportArray));

        int[] result = new int[givenArray.length];
        int idx = 0;
        for (int j = 0; j < givenArray.length; j++) {
            for (int k = 0; k < supportArray[k]; k++) {
                System.out.println("Wartość do tablicy" + j + " i idx" + idx);
                result[idx++] = j;
            }
        }

        return result;
    }

    private static int checkRange(int[] givenArray) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < givenArray.length; i++) {
            if (givenArray[i] > max) {
                max = givenArray[i];
            }
            if (givenArray[i] < min) {
                min = givenArray[i];
            }

        }
        int result = max - min + 1;
        return result;
    }
}
// TODO: 2020-07-05 ma działać też z ujemnymi
