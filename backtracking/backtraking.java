package backtracking;

public class backtraking {
    public static void printpermutation(String str,String permutation,int idx)
    {

        if(str.length()==0)
        {
            System.out.println(permutation);
            return;
        }

     for(int i=0;i<str.length();i++)
     { 
          char ch=str.charAt(i);
          String newstr=str.substring(0,i)+str.substring(i+1);
          printpermutation(newstr,permutation+ch,idx+1);
     }
    }
    public static void main(String[] args) {
        String str="ABC";
        String permutation="";

        printpermutation(str,permutation,0);

    }
}
