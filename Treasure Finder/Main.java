#include<iostream>
using namespace std;
int main()
{
  int a,b,c,hcf,st;
  cin>>a>>b>>c;
  if((a<b && c>b) || (c<b && a>b))
    cout<<"The treasure is in box which has number "<<b;
  else if((b<a && c>a) || (c<a && b>a))
    cout<<"The treasure is in box which has number "<<a;
  else if((b<c && c<a) || (a<c && c<b))
    cout<<"The treasure is in box which has number "<<c;
  
  st=a<b?(a<c?a:c):(b<c?b:c);
	 for (hcf=st;hcf>=1;hcf--)
 	{
  	  if (a%hcf==0 && b%hcf==0 && c%hcf==0)
  		 break;
 	} 
  cout<<"\nThe code to open the box is "<<hcf;
 return 0;
}
