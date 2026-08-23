package level3;

/**
 * Calculates the number of ways {@code n} guests can attend a party.
 * <p>
 * Each guest can either attend:
 * <ul>
 * <li>Single (by themselves)</li>
 * <li>Paired (with any one of the remaining {@code n - 1} guests)</li>
 * </ul>
 *
 * <p>
 * <b>Mathematical Recurrence:</b>
 * <br> {@code f(n) = f(n-1) + (n-1) * f(n-2)}
 */
public class guestPairSingle {

    /**
     * Recursively computes the total number of ways to arrange {@code n} guests
     * as singles or pairs.
     *
     * @param n the total number of guests (must be greater than 0)
     * @return total count of unique single/pair combinations
     */
    public static int guestsinglePairCount(int n) {
        // Base Cases:
        // 1 guest  -> 1 way (Single)
        // 2 guests -> 2 ways (Both single OR 1 pair)
        if(n<=1)
        {
            return 1;
        }

        // Choice 1: The n-th guest stays single.
        // The remaining (n - 1) guests can pair/stay single in guestsinglePairCount(n - 1) ways.
        int singleGuest = guestsinglePairCount(n - 1);

        // Choice 2: The n-th guest forms a pair with one of the remaining (n - 1) guests.
        // There are (n - 1) options to choose a partner, and the remaining (n - 2) guests 
        // can pair/stay single in guestsinglePairCount(n - 2) ways.
        int pairGuest = (n - 1) * guestsinglePairCount(n - 2);

        // Total ways = ways when n-th guest is single + ways when n-th guest is paired
        return singleGuest + pairGuest;
    }

    /**
     * Main execution method to demonstrate the guest pairing algorithm.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        int n = 4;

        int totalWays = guestsinglePairCount(n);

        System.out.println(totalWays);
    }
}
