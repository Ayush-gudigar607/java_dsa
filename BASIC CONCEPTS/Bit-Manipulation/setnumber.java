//this is for set  the bit
public class setnumber {
    public static void main(String[] args) {
      int n=5;
      int pos=1;
      int bitMask=1<<pos;
      int newnumber=(bitMask | n);

      if(newnumber==0)
      {
        System.out.print("bit is zero");
      }
      else{
        System.out.print("bit is one");
      }
      System.out.print(newnumber);
    }
}