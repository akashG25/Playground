#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2,tatd1=0,tatc1=0;
  cout<<""<<""<<""<<"";
  cin>>d1>>c1>>d2>>c2;
  tatd1=d1+d2;
  tatc1=c1+c2;
  while(tatc1>100)
  {
    tatc1=tatc1-100;
    tatd1=tatd1+1;
    break;
  }
  cout<<tatd1<<"\n"<<tatc1;
  return 0;
}