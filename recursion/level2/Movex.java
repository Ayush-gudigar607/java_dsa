package level2;

public class Movex{
    public static void MoveX(String str,int idx,int count,String newString)
    {

        if(idx==str.length())
        {
            for(int i=0;i<count;i++)
            {
                newString+='x';
            }
            System.out.println(newString);
            return;
        }
        char currentChar=str.charAt(idx);

        if(currentChar=='x')
            {
                count++;
                MoveX(str,idx+1,count,newString);
            }
            else
            {
                newString+=currentChar;
                MoveX(str,idx+1,count,newString);
            }
        
    }

    public static void main(String[] args)
    {
  String str="axbcxxd";
  MoveX(str,0,0,"");
    }
}