//this is for get the bit
public class getbit {
    public static void main(String[] args) {
      int n=5; //0101
      int position=2;
      int bitMask=1<<position;

      if((bitMask & n)==0)
      {
      System.out.print("bit was zero");
      }
      else{
        System.out.print("bit was 1");
      }
    }
}