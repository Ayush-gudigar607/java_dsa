//this is for update bit operation

import java.util.*;

public class updatebit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int pos = 1;
        int oper = sc.nextInt();
        int newnumber = 0;
        int notbit = 0;

        int bitMask = 1 << pos;
        if (oper == 0) {
            //clear
            notbit = ~(bitMask);
            newnumber = (notbit & n);
            System.out.print(newnumber);
        } else {
            //set 
            newnumber = (bitMask | n);
            System.out.print(newnumber);
        }

    }
}