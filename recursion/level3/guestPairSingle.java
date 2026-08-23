package level3;

public class guestPairSingle {
    public static int guestsinglePairCount(int n)
    {
        if(n==1 || n==2)
        {
            return n;
        }

        //for single guest
        int singleGuest=guestsinglePairCount(n-1);

        //for pair guest
        int pairGuest=(n-1)*guestsinglePairCount(n-2);

        return singleGuest+pairGuest;

        }
    

    public static void main(String[] args) {
        int n=4;

        int totalWays=guestsinglePairCount(n);
        
        System.out.println(totalWays);
    }
}

