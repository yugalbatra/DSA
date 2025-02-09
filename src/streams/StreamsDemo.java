package streams;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsDemo {

    public static void main(String[] args) {
        // Example 1: Collecting names by length.
        List<String> l1 = Arrays.asList("Anna", "Bob", "Alexander", "Brian", " Alice");
        System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));

        // Example 2: Counting word occurrences.
        String sentense = "hello world hello java world";
        System.out.println(Arrays.stream(sentense.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));
    }
}

class EvenProductTriplets {
    static final int MOD = 1_000_000_007;

    // Function to calculate nCr % MOD
    static long nCr(int n, int r) {
        if (n < r) {
            return 0;
        }
        long numer = 1;
        for (int i = 0; i < r; i++) {
            numer = numer * (n - i) % MOD;
        }
        long denom = 1;
        for (int i = 1; i <= r; i++) {
            denom = denom * i % MOD;
        }
        return numer * modInverse(denom, MOD) % MOD;
    }

    // Function to compute modular inverse using Fermat's Little Theorem
    static long modInverse(long a, int m) {
        return power(a, m - 2, m);
    }

    // Function to compute (base^exp) % mod
    static long power(long base, int exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = result * base % mod;
            }
            base = base * base % mod;
            exp >>= 1;
        }
        return result;
    }

    public static int countEvenTriplets(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;

        // Count even and odd numbers
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
        }

        int n = arr.length;

        // Total triplets
        long totalTriplets = nCr(n, 3);
        // All-odd triplets
        long oddTriplets = nCr(oddCount, 3);

        // Valid triplets are totalTriplets - oddTriplets
        long result = (totalTriplets - oddTriplets + MOD) % MOD;
        return (int) result;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 4, 8, 2,1,3,4,1 };
        System.out.println(countEvenTriplets(nums)); // Output: 4
    }
}

class LexicographicallySmallest {
    public static String getSmallestString(String s) {
        char[] chars = s.toCharArray();
        boolean changed = false;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != 'a') {
                // Start replacing characters
                for (int j = i; j < chars.length; j++) {
                    if (chars[j] == 'a') break;
                    chars[j] = (char) (chars[j] - 1);
                }
                changed = true;
                break;
            }
        }

        // If no characters were replaced (all are 'a'), replace the last character
        if (!changed) {
            chars[chars.length - 1] = 'z';
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        String s = "dslhflesfaldfdjlk";
        System.out.println(getSmallestString(s)); // Output: "gackerrank"
    }
}

class TransactionSimplification {

    public static int getMinTransactions(int n, List<List<Integer>> transactions) {
        // The list 'balance' will hold the net amount for up to 12 individuals
        // Negative values mean the person needs to pay that amount, positive values mean the person should receive that amount
        List<Integer> balance = new ArrayList<>(Collections.nCopies(12, 0));

        // Calculate the balance for each person involved in the transactions
        for (List<Integer> transaction : transactions) {
            balance.set(transaction.get(0), balance.get(transaction.get(0)) - transaction.get(2)); // person paying out
            balance.set(transaction.get(1), balance.get(transaction.get(1)) + transaction.get(2)); // person receiving payment
        }

        // Create a list to store non-zero balances (amounts that need to be settled)
        List<Integer> nonZeroBalances = new ArrayList<>();
        for (int b : balance) {
            if (b != 0) {
                nonZeroBalances.add(b);
            }
        }

        // Prepare to find the minimum number of transactions to settle all debts
        int numAccounts = nonZeroBalances.size();
        int[] minTransfers = new int[1 << numAccounts]; // 1<<numAccounts is 2^numAccounts
        Arrays.fill(minTransfers, Integer.MAX_VALUE / 2); // Initialize with a large value
        minTransfers[0] = 0; // No transfers needed when there is no debt

        // Loop through all possible subsets of debts
        for (int i = 1; i < (1 << numAccounts); ++i) {
            int sum = 0;

            // Calculate the sum of balances in the current subset
            for (int j = 0; j < numAccounts; ++j) {
                if ((i >> j & 1) == 1) { // If the j-th person is in the current subset (i)
                    sum += nonZeroBalances.get(j);
                }
            }

            // If the sum is zero, then the current subset can be settled among themselves
            if (sum == 0) {
                // Set initial transfers for this subset as the number of involved accounts minus 1 transfer
                minTransfers[i] = Integer.bitCount(i) - 1;

                // Try to split the subset into two parts and minimize their transfers
                for (int j = (i - 1) & i; j > 0; j = (j - 1) & i) {
                    // Update the minimum transfers for the current subset
                    minTransfers[i] = Math.min(minTransfers[i], minTransfers[j] + minTransfers[i ^ j]);
                }
            }
        }

        // Return the number of transactions for the set including all non-zero balances
        return minTransfers[(1 << numAccounts) - 1];
    }
}
