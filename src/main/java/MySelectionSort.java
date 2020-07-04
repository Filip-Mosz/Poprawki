public class MySelectionSort {

    public MySelectionSort() {
    }

    public static int[] sort(int[] givenArray){
        int start = 0;
        int temp = 0;
        int lowestIdx = 0;

        for (int i = start; i < givenArray.length; i++){
            int lowest = Integer.MAX_VALUE;

            for(int j = start; j < givenArray.length; j++){
                if(givenArray[j] < lowest){
                    lowest = givenArray[j];
                    lowestIdx = j;
                }
                temp = givenArray[lowestIdx];

                givenArray[lowestIdx] = givenArray[i];
                givenArray[i] = lowest;
            }
            start++;
        }

        return givenArray;
    }
}
