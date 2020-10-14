#include<iostream>
#include<cmath>
using namespace std;
int main()
{
 int a=3, b=4;
  int x,y,z,res;
  cin>>x>>y;
  z=pow((x-a),2) + pow((y-b),2);
  res=sqrt(z);
  cout<<res;
}