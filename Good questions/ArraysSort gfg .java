//https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/

input:    4
3
0
6
2           

output:
0
2
3
4
6
[0, 2, 3, 4, 6]
0
2
3
4
6

---------

import java.util.*;

public class Main {
  
  
  
public static void main(String[] args) throws Exception {
 // PriorityQueue<String> pq=new PriorityQueue<>(Collections.reverseOrder());
 Scanner sc=new Scanner(System.in);
 int[] a=new int[5];
  for(int i=0;i<5;i++)
    {
        a[i]=sc.nextInt();
    }
 Arrays.sort(a);
    for(int i=0;i<5;i++)
    {
        System.out.println(a[i]);
    }
   System.out.println( Arrays.toString(a));
    for(int i=0;i<5;i++)
    {
        System.out.println(a[i]);
    }
  }

}
