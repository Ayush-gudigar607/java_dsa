package level2;

public class duplicate {
    public static boolean[] map=new boolean[26];
  
    public static void removeDuplicates(String str,int idx,String newString){

        if(idx==str.length())
        {
            System.out.println(newString);
            return;
        }
        char currentChar=str.charAt(idx);
        //already element is there then this condition
        if(map[currentChar-'a']==true){
             removeDuplicates(str,idx+1,newString);
        }
        else
        {
            //if the element is new then add the element then make it true
            newString+=currentChar;
            map[currentChar-'a']=true;
            removeDuplicates(str,idx+1,newString);
        }
    }

    public static void main(String[] args)
    {
      String str="abbccdd";
      removeDuplicates(str,0,"");
    }

}
