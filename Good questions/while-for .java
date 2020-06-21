input: 3
output:
#
#
#
#
#

----
import java.util.*;

public class Main {
  
  
  
public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    
    int count =0;
    while(count<5)
    {
        for(int i=0;i<n && count<5;i++)
        {
            count++;
            System.out.println("#");
        }
    }
    
    
  }

}
