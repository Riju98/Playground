#include<iostream>
#include<stdlib.h>
#include<string.h>
using namespace std;

void consonants(char *string)
{
    int length = strlen(string);
    int count = length;
    for (int j = 0; j < length;) {
        switch (string[j]) {
        case 'a':
        case 'A':
        case 'e':
        case 'E':
        case 'i':
        case 'I':
        case 'o':
        case 'O':
        case 'u':
        case 'U':
            for (int k = j; k < count; k++) {
                string[k] = string[k + 1];
            }
            count--;
            break;
        default:
            j++;
        }
    }
    string[count] = '\0';
    printf("%s", string);
}

int main()
{
    char str[100];
    scanf("%s",str);
    consonants(str);
    return 0;
}


