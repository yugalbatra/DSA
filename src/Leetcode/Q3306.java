package Leetcode;

public class Q3306 {

    public long countOfSubstrings(String word, int k) {
        int[] vowels = new int[6];
        int left = 0, count = 0;
        for (int i = 0;i < word.length();i++) {
            vowelOperation(vowels, word.charAt(i), true);
            while (vowels[5] > k) {
                vowelOperation(vowels, word.charAt(left++), false);
            }

            if (valid(vowels, k)) {
                while (true) {
                    count++;
                    vowelOperation(vowels, word.charAt(left++), false);
                    if (!valid(vowels, k)) {
                        vowelOperation(vowels, word.charAt(--left), true);
                        break;
                    }
                }
            }
        }

        return count;
    }

    private void vowelOperation(int[] vowels, char ch, boolean add) {
        switch(ch) {
            case 'a':
                vowels[0] = add ? vowels[0]+1 : vowels[0]-1;
                break;
            case 'e':
                vowels[1] = add ? vowels[1]+1 : vowels[1]-1;
                break;
            case 'i':
                vowels[2] = add ? vowels[2]+1 : vowels[2]-1;
                break;
            case 'o':
                vowels[3] = add ? vowels[3]+1 : vowels[3]-1;
                break;
            case 'u':
                vowels[4] = add ? vowels[4]+1 : vowels[4]-1;
                break;
            default:
                vowels[5] = add ? vowels[5]+1 : vowels[5]-1;
        }
    }

    private boolean valid(int[] vowels, int k) {
        for (int i = 0;i < 5;i++) {
            if (vowels[i] == 0) return false;
        }

        return vowels[5] == k;
    }

    public static void main(String[] args) {
        new Q3306().countOfSubstrings("aoaiuefi", 1);
    }
}
