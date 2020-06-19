#include<iostream>
using namespace std;
int main()
{
  int num;
  int count=0;
  cout<<"";
  cin>>num;
  if(num==0)
  {
    num=1;
  }
  while(num>0)
  {
    num=num/10;
    count++;
  }
  cout<<count;
  return 0;
  
    
}