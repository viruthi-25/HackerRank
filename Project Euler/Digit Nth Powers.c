
#include<stdio.h>
#include<math.h>
int main()
{ 
    unsigned int n,rem;
    unsigned int i,d,sum=0,sum2=0;
    //printf("Enter the power:");
    scanf("%u",&d);
    for(i=2;i<1354954;i++)
    {
    n=i,sum=0;
    while(n>0)
    {
        rem=n%10;
        n/=10;
        sum+=pow(rem,d);
    }
    if(sum == i)
    {
    //    printf("\nThe nos are palindrome");
    //    printf("\nsum is : %lu",sum);
        sum2+=sum;
    }
}
printf("%u",sum2);
return 0;
}
