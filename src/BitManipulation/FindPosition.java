package BitManipulation;

public class FindPosition {

    static int findPosition(int N) {
        int pos = 1, ans = -1;
        for (int i = 1; i <= N * 2; i *= 2) {
            if ((N & i) == N) {
                if (ans == -1) {
                    ans = pos;
                }
                else {
                    return -1;
                }
            }
            pos++;
        }

        return ans;
    }
}
