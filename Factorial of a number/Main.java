#include<iostream>
using namespace std;
int main(){
  int n, f=1, i;
  cin>>n;
  for(i=1; i<=n; i++)
    f*=i;
  cout<<f;
}