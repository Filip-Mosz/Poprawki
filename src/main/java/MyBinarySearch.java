public class MyBinarySearch {
    private static int low;
    private static int mid;
    private static int high;
    private static int searched;
    private static int[] givenArray;

    public MyBinarySearch(int searched, int[] givenArray) {

        MyBinarySearch.givenArray = givenArray;
        low = 0;
        high = givenArray.length;
    }

    public static int search(int[] givenArray, int searched) {
        low = 0;
        high = givenArray.length;


        while (true) {
            mid = (low + high) / 2;
            if (givenArray[mid] == searched) {
                return mid;
            } else if (givenArray[mid] > searched) {
                high = mid - 1;
            } else if (givenArray[mid] < searched) {
                low = mid + 1;
            }
            if (high <= low || searched > givenArray.length) {
                return -1;
            }
        }

        // TODO: 2020-07-04 przerobić na generyka(tylko po co?) 

    }
}
