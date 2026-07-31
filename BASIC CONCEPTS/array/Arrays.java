
public class Arrays{
    public static void main(String[] args) {
      int [] marks=new int[3];
      marks[0]=97;
      marks[1]=99;
      marks[2]=98;
      // System.out.println(marks); //this gives garbage value because it is an array and not a single variable
      // System.out.println(marks[0]);
      // System.out.println(marks[1]);
      // System.out.println(marks[2]);

      for(int i=1;i<=3;i++)
      {
        System.out.println(marks[i]); //this gives error because array index starts from 0 and ends at n-1
      }


    }
}