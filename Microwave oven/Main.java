#include<iostream>
using namespace std;
int main()
{
  int n;
  double h;
  cin>>n>>h;
     if(n==1)
       cout<<h;
 
     else if(n==2)
     {
       h+= h/2;
       cout<<h;
     }
     else if(n==3)
       cout<<2*h;
     else
       cout<<"Number of items is more";
       
}