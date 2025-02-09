package Leetcode;

public class RobotReturnToOrigin {

    public boolean judgeCircle(String moves) {
        int h = 0, v = 0;
        for (char ch : moves.toCharArray()) {
            switch (ch) {
                case 'R':
                    h++;
                    break;
                case 'L':
                    h--;
                    break;
                case 'U':
                    v++;
                    break;
                case 'D':
                    v--;
            }
        }

        return h == 0 && v == 0;
    }
}
