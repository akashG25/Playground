#include<iostream>
using namespace std;
main()

{

int n1,n2,p=0;

std::cin>>n1>>n2;

for(int i=n1;i<=n2;i++)

{

for(int j=1;j<i;j++)

{

if(i%j==0)

p+=j;

else

p+=0;

}

if(p==i)

{

std::cout<<p<<" ";

p*=0;

}

else

p*=0;

}
}
