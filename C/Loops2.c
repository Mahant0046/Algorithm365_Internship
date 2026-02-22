#include <stdio.h>
void  Floyds_Triangle(int size){
    int bit=1;
    for (int row = 1; row <= size; row++)
    {
        bit=(row%2==0)?0:1;
        for (int column = 1; column <= row; column++)
        {
            printf("%d",bit);
            bit=(bit==0)?1:0;
        }
        printf("\n");
    }
}
void Pascals_Triangle(int size){
    for (int row = 1; row <= size; row++)
    {
        
        for (int column = 1; column <= row; column++)
        {
            printf("1");
            
        }
        printf("\n");
    }

}
void Pyramid_stars(int height){
    for (int i = 1; i <= height; i++)
    {
        for (int j = 1; j <= height-i; j++)
        {
            printf(" ");
        }

        for (int k = 1; k <=i ; k++)
        {
            printf("* ");
        }
        printf("\n");      
    }
    
}
void Pyramid_Increasing_Numbers(int height){
    int num=1;
    for (int i = 1; i <= height; i++)
    {
        for (int j = 1; j <= height-i; j++)
        {
            printf(" ");
        }

        for (int k = 1; k <=i ; k++)
        {
            printf("%d ",num++);
        }
        printf("\n");      
    }
    
}
int main() { 
    // Floyds_Triangle(5);
    // Pyramid_stars(4);
    Pyramid_Increasing_Numbers(4);
}