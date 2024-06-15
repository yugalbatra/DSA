package Array;

public class ThreeWayPartitioning {

    public void threeWayPartition(int[] array, int a, int b) {
        int start = 0, end = array.length - 1;
        for (int i = 0; i <= end; ) {
            if (array[i] < a) {
                array[start] = array[start] ^ array[i] ^ (array[i] = array[start]);
                start++;
                i++;
            }
            else if (array[i] > b) {
                array[end] = array[end] ^ array[i] ^ (array[i] = array[end]);
                end--;
            }
            else {
                i++;
            }
        }
    }
}
