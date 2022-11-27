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
        String s=sc.next();
        String s1=s.substring(8);
        String s2=s.substring(0,8);
        String[] res = s2.split("[:]", 0);
        int a[]=new int[3];
        int i=0;
        for(String myStr: res)
            {
                int a1=Integer.parseInt(myStr);
                a[i]=a1;
                i++;
            }
        if(s1.equals("PM"))
        {
            if(a[0]==12)
            {
           System.out.println((String.format("%02d",(a[0])))+":"+(String.format("%02d",a[1]))+":"+(String.format("%02d",a[2])));
            }
            else
            {
                System.out.println((String.format("%02d",(a[0]+12)))+":"+(String.format("%02d",a[1]))+":"+(String.format("%02d",a[2])));
            }
        }
        else
        {
            if(a[0]>=12)
            {
           System.out.println((String.format("%02d",(a[0]-12)))+":"+(String.format("%02d",a[1]))+":"+(String.format("%02d",a[2])));
            }
            else
            {
                System.out.println((String.format("%02d",(a[0])))+":"+(String.format("%02d",a[1]))+":"+(String.format("%02d",a[2])));
            }
        }
      }
}
