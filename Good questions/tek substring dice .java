input:
2
3
101
5
11010   

output:
John
John


----

import java.util.*;

public class Main{

public static void main(String[] args) {

// write your code here.

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

for(int i=0;i<n;i++)
{
    String s=sc.nextLine();
    String z=minSteps(s);
    System.out.println(z);
   
}
}

public static String minSteps(String str)
{
 
    String count = "John";
    int countt=1;
 
   while(str.length()>1)
   {    
            if (str.contains("10"))
        {
           
              str.replace("10","");
              if(countt%2!=0)
              {
                  count="John";
              }
              else{
                  count="Joe";
              }
                  
                 countt++;
                 
       
        }
        else if (str.contains("01"))
        {
           
              str.replace("01","");
                  if(countt%2!=0)
              {
                  count="John";
              }
              else{
                  count="Joe";
              }
                  
                  countt++;
        }
   
       
    }
       
  return count;
}
