//https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/

input:
   4
3
0
6
2         

output:
6
4
3
2
0
[6, 4, 3, 2, 0]
6
4
3
2
0

----

import java.util.*;
import java.util.Collections;

public class Main {
  
 //int is primitive type
 //Integer is Wrapper class
  
public static void main(String[] args) throws Exception {
 // PriorityQueue<String> pq=new PriorityQueue<>(Collections.reverseOrder());
 Scanner sc=new Scanner(System.in);
 Integer[] a=new Integer[5];
  for(int i=0;i<5;i++)
    {
        a[i]=sc.nextInt();
    }
    //Arrays.sort(a);
// Arrays.sort(a,Collections.reverseOrder());
 // Arrays.sort(arr, Collections.reverseOrder()); 
 
 Arrays.sort(a, Collections.reverseOrder()); 
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
