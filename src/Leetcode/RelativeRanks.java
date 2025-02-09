package Leetcode;

public class RelativeRanks {

    public String getRankValue(int rank) {
        return switch (rank) {
            case 1 -> "Gold Medal";
            case 2 -> "Silver Medal";
            case 3 -> "Bronze Medal";
            default -> String.valueOf(rank);
        };
    }

    public String[] findRelativeRanks(int[] score) {
        String[] ans = new String[score.length];
        for (int i = 0; i < score.length; i++) {
            int rank = 0;
            for (int j = 0; j < score.length; j++) {
                if (score[i] < score[j]) {
                    rank++;
                }
            }
            ans[i] = getRankValue(rank+1);
        }

        return ans;
    }
}
