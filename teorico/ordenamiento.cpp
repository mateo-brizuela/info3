#include <stdio.h>

int main(int argc, char const *argv[])
{
    int i;
    int j;
    int cop;
    int vector[] = {8, 5, 9, 2, 6, 3};

    for ( i = 0; i < 5; i++)
    {
        if (vector[i] > vector[i+1] || i==5)
        {
            j = i+1;
            while (vector[j] < vector[j-1] || j==0)
            {
                cop = vector[j-1];
                vector[j-1] = vector[j];
                vector[j] = cop;
                j--;    
            }
        }
        
    }

    for ( i = 0; i < 6; i++)
    {
        printf("%d",vector[i]);
    }
    
    



    return 0;
}
