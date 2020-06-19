#include<iostream>
using namespace std;
int main()
{
	int n,a1=6,j,result=0;
	cin>>n;
	cout<<a1<<" ";
	for(int i=2;i<=n;i++)
	{
		for(j=1;j<n;j++)
		{
			result=a1+5*j;
			cout<<result<<" ";
			a1=result;
		}
		break;
	}
	return 0;
}