import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    public static void main(String[] args) throws IOException {
    Scanner sc=new Scanner(System.in);    
    int n=sc.nextInt();
    int count=0,count1=0,count2=0;
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        if(a[i]>0)
        {
            count++;
        }
        else if(a[i]==0)
        {
            count1++;
        }
        else
        {
            count2++;
        }
    }
    Double a1=new Double(count);
   Double b1=new Double(count1);
   Double c1=new Double(count2);
   Double n1=new Double(n);
    System.out.println(String.format("%.6f", a1/n1));
    System.out.println(String.format("%.6f", c1/n1));
     System.out.println(String.format("%.6f", b1/n1));
   }
}
