/*#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
 int p,r,t;
int i, total; 
  float disc, f;
  cin>>p>>r>>t;
  i=p*r*t/100;
  total= p+i;
  disc=(i*0.02);
  f= (total-disc);
  printf("%d\n",i);
  printf("%d\n",total);
  printf("%0.2f\n",disc);
  printf("%0.2f\n",f);
  return 0;
}*/
#include<iostream>
using namespace std;
int main(){
int x,y,r;
double inter,amount,disc,f;
cin>>x>>y>>r;

inter=(x*y*r)/100;
amount=x+inter;
disc=inter*2/100;
f=amount-disc;
cout<<inter<<endl;
cout<<amount<<endl;
cout<<disc<<endl;
cout<<f;
return 0;
}