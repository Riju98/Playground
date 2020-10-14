#include<iostream>
using namespace std;
int main()
{
  int num, n1,n2,div,i,sum;
  cin>>n1>>n2;
  num = n1+n2;
  for (i=1; i < num; i++)
    {
        div = num % i;
        if (div == 0)
            sum = sum + i;
    }
    if (sum == num)
        cout <<"They can read the message";
    else
        cout<<"They can't read the message";
    return 0;
}