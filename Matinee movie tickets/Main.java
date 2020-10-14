#include<iostream>
using namespace std;
int main()
{
  int age;
  double time;
  double mat = 13.30;
  cin>>age>>time;
  if(age>13)
  {
    if(time == mat)
      cout<<"$5.00";
    else
      cout<<"$8.00";
  }
  else
  {
    if(time == mat)
      cout<<"$2.00";
    else
      cout<<"$4.00";
  }
}