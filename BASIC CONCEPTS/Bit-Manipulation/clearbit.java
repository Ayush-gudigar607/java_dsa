//this is for clear the bit
public class clearbit{
    public static void main(String[] args) {
      int n=5;
      int pos=2;
      int bitMask=1<<pos;
      int NOTbitmask=~(bitMask);
      int newNumber=(NOTbitmask & n);
      System.out.print(newNumber);


    }
}