#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char * removeDuplicates(char * input){
    char *newInput = malloc(strlen(input) + 1);
    int newI = 0;
    int alpha[27] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    for(int i = 0; i < strlen(input); i++)
    {
        if(input[i] <= 122 && input[i]>= 97)
        {
            if(alpha[input[i]-97] != 1)
            {
            alpha[input[i]-97] = 1;
            newInput[newI] = input[i];
            newI++;
            }
        }
        else if(input[i] == 32)
        {
            if(alpha[26] != 1)
            {
                alpha[26] = 1;
                newInput[newI] = ' ';
                newI++;
            }
        }


    }
    newInput[newI] = '\0';
    return newInput;
}

int main()
{
    printf("%s", removeDuplicates("hello world today"));
    return 1;
}

