#include<iostream>
using namespace std;
int main()
{
  int r,a;
  cin>>r>>a;
  if(2*r<a || a==2*r)
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
}