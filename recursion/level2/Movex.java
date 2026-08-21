package level2;

public class Movex {
 public static void Movex(String str,int index,int count,String newString)
 {
    //base case if index is equal to the length of the string then return
    if(index==str.length())
    {
        for(int i=0;i<count;i++)
        {
            newString+='x';
        }
        System.out.println(newString);
        return;
    }
    //if current character is 'x' then increment the count and make a recursive call for the next index
    char currentChar=str.charAt(index);
    if(currentChar=='x')
    {
        count++;
        Movex(str,index+1,count,newString);
    }
    else{
        newString+=currentChar; //newString=newString+currentChar;
        Movex(str,index+1,count,newString);
    }
 }
 
 public static void main(String args[])
 {
    //test case for Movex
    String str="axbxcxxd";
    Movex(str,0,0,"");
 }
}
