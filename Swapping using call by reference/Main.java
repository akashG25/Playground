#include <stdio.h>  
void swap(int *, int *); //prototype of the function   
int main()  
{  
    int a,b;
	printf("");
	scanf("%d%d",&a,&b);
    printf("Before swapping a= %d and b=%d\n",a,b); // printing the value of a and b in main  
    swap(&a,&b);  
    printf("After swapping a= %d and b=%d\n",a,b); // The values of actual parameters do change in call by reference, a = 10, b = 20  
}  
void swap (int *a, int *b)  
{  
    int temp;   
    temp = *a;  
    *a=*b;  
    *b=temp;  
}  