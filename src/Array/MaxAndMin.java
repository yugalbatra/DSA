package Array;

class Pair {
    int max;

    int min;

    public Pair(final int max, final int min) {
        this.max = max;
        this.min = min;
    }

    @Override
    public String toString() {
        return "max = " + max + " and min = " + min;
    }
}

public class MaxAndMin {

    public static Pair maxAndMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }

        return new Pair(max, min);
    }

    public static void main(String[] args) {
        System.out.println(maxAndMin(new int[]{1,5,3,6,8,-1,-34,8,3}));
    }
}
