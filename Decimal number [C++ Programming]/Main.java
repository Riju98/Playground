#include<iostream>
using namespace std;
int dec_to_oct(int n)
{
    int octalNumber = 0, i = 1;

    while (n != 0)
    {
        octalNumber += (n % 8) * i;
        n /= 8;
        i *= 10;
    }

    return octalNumber;

}
int main()
{
    int n;
    cin>>n;
    cout<<dec_to_oct(n);
}
