#include<stdio.h>
int gcd(int a,int b)
{
  int gcd=0;
   for(int i=1; i <= a && i <= b; ++i)
    {
        if(a%i==0 && b%i==0)
            gcd = i;
    }
  return gcd;
}
int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    printf("%d ",gcd(a,b));
    return 0;
}
