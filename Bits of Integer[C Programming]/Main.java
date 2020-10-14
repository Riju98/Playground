#include<stdio.h>
int dec_to_bin(int n)
{
  int c, i;
  c=0;
  if(n==0)
    return 0;
  else
  {
    for(i=0; i<32; i++)
    {
      if((1<<i) & n)
        c=i;
    }
  }
  return (c+1);
}
int main()
{
    int n;
    scanf("%d",&n);
    printf("%d",dec_to_bin(n));
}
