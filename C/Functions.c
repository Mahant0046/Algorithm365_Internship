#include<stdio.h>
void reverseString(char str[],int size){
    int left=0,right=size-1;
    while (left < right)
    {
        char temp=str[left];
        str[left]=str[right];
        str[right]=temp;
        left++;
        right--;
    }
    printf("%s",str);

}
int factorial(int number){
    int fact=1;
    while (number>0)
    {
        fact*=number;
        number--;
    }
    return fact;
    
}
void main(){
    char str[]="Hello";
    int size=sizeof(str)-1;
    reverseString(str,size);
    int fact=factorial(5);
    printf("%d",fact);
    
}