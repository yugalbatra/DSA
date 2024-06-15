package Array;

import java.util.ArrayList;

public class FactorialOfLargeNumber {

    static void multiply(ArrayList<Integer> arrayList, int x) {
        int carry = 0;
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            int mul = arrayList.get(i) * x + carry;
            carry = mul / 10;
            arrayList.set(i, mul % 10);
        }

        while (carry != 0) {
            arrayList.add(0, carry % 10);
            carry /= 10;
        }
    }

    static ArrayList<Integer> factorial(int N) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        for (int i = N; i > 1; i--) {
            multiply(arrayList, i);
        }

        return arrayList;
    }
}
