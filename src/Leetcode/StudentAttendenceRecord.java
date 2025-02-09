package Leetcode;

public class StudentAttendenceRecord {

    public boolean checkRecord(String s) {
        int a = 0, l = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'L') {
                l++;
            }
            else {
                l = 0;
            }
            if (ch == 'A') {
                a++;
            }

            if (l == 3 || a == 2) {
                return false;
            }
        }

        return true;
    }
}
