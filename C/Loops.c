#include <stdio.h>
int main() {

    //  Vertical Multiplier Table from 1 to n
    int iter;
    scanf("%d",&iter);

    // Horizontal Table
    // for (int number = 1; number <= iter; number++)
    // {
    //     for (int mulitple = number; mulitple <=10;mulitple++)
    //     {
    //         printf("%d X %d=%d ",mulitple,number,number*mulitple);
    //     }
    //     printf("\n");
    // }
     
    // Vertical Table
    for (int i = 1; i <= 10; i++) {  
        for (int j = 1; j <= iter; j++)
        {
            printf("%d X %d=%d  ",j,i,i*j);
        }
        printf("\n");
    }

}