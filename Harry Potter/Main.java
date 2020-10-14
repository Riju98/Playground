#include<iostream>
using namespace std;

int main()
{
int n,first,last,sum;
cin>>n;
last=n % 10;
if(n<1000)
{
  first=0;
}
else
{
while(n>=10)
 n=n/10;
first= n;
}
sum=first+last;
cout<<sum;
 return 0;
}
