#include<iostream>
using namespace std;
int main()
{
	int n;
	float a=0.5,n1=0.5,result=0,j=2;
	cin>>n;
	cout<<a<<" ";
	
	for(int i=2;i<=n;i++)
	{  
	
		while(j<=i)
		{
		result=n1*3;
		cout<<result<<" ";
		j++;
		}
		
	   n1=result;	
		
	}
	
	return 0;
	
}