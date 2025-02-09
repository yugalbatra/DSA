package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            int temp = i;
            boolean isSDN = true;
            while (temp != 0) {
                int reminder = temp % 10;
                if (reminder == 0 || i % reminder != 0) {
                    isSDN = false;
                    break;
                }
                temp /= 10;
            }
            if (isSDN) {
                list.add(i);
            }
        }

        return list;
    }
}
