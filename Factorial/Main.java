#include<stdio.h>
long int multiplyNumbers(int n);
int main() {
    int n;
    printf("");
    scanf("%d",&n);
    printf("The factorial of %d is %ld", n, multiplyNumbers(n));
    return 0;
}

long int multiplyNumbers(int n) {
    if (n>=1)
        return n*multiplyNumbers(n-1);
    else
        return 1;
}