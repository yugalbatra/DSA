package Leetcode;

public class ConstructTheRectagle {

    public int[] constructRectangle(int area) {
        int[] ans = new int[2];
        int L = (int) Math.sqrt(area), B = L;
        while (true) {
            if (L * B == area) {
                return new int[] { L, B };
            }
            else if (L * B > area) {
                B--;
            }
            else {
                L++;
            }
        }
    }
}
