#include<iostream>
using namespace std;
int main()
{
  int n,a1=121,a2=104,result;
  cin>>n;
  cout<<a1<<" ";
  for(int i=2;i<=n;i++)
  {
    result=a1+a2;
    cout<<result<<" ";
    a1=result;
    a2=a2+32;
  }
  return 0;
}