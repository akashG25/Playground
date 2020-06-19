#include<iostream>
using namespace std;
 
int main()
{
    int val, num, sum = 0,display=0;
 
    cout << "";
    cin >> val;
    num = val;
    while (num != 0)
    {
        sum = sum + num % 10;
        num = num / 10;
    }
    if(val%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}