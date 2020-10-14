#include <stdio.h>

int main() 
{
  
    int i = 65;
    int k = 120;
  int t;
    printf("%d %d\n", i, k);

  	t = i;
    i = k;
    k = t;
    printf("%d %d", i, k);

    return 0;
    
}
