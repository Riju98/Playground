#include<iostream>
using namespace std;
int main()
{
	int f_p, f_d, f_s;
  	int s_p, s_d, s_s;
  	int a_p, a_d, a_s;
  	cin>>f_p>>f_d>>f_s;
    cin>>s_p>>s_d>>s_s;
    cin>>a_p>>a_d>>a_s;
  	int f_t, s_t, a_t;
  
  	f_t = f_p - (f_p*f_d*0.01) + f_s;
  	s_t = s_p - (s_p*s_d*0.01) + s_s;
  	a_t = a_p - (a_p*a_d*0.01) + a_s;
  
  	cout<<"In Flipkart Rs."<<f_t<<endl;
  	cout<<"In Snapdeal Rs."<<s_t<<endl;
  	cout<<"In Amazon Rs."<<a_t<<endl;
  
  	if(f_t<s_t && f_t<a_t)
      cout<<"He will prefer Flipkart";
  	else if(a_t<s_t && a_t<f_t)
      cout<<"He will prefer Amazon";
  	else if(s_t<f_t && s_t<a_t)
      cout<<"He will prefer Snapdeal";
  	else
      cout<<"He will prefer Flipkart";
}