package Leetcode;

public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        for (int i = 0; i < flowerbed.length; i++) {
            if (validPlace(flowerbed, i)) {
                flowerbed[i] = 1;
                if (--n == 0) return true;
            }
        }

        return false;
    }

    private boolean validPlace(int[] flowerbed, int i) {
        if (flowerbed.length == 1) return flowerbed[i] == 0;
        if (i == 0) {
            if (flowerbed[i] == 1) {
                return false;
            } else {
                return flowerbed[i + 1] != 1;
            }
        } else if (i == flowerbed.length - 1) {
            if (flowerbed[i] == 1) {
                return false;
            } else {
                return flowerbed[i - 1] != 1;
            }
        } else {
            return flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0;
        }
    }
}
