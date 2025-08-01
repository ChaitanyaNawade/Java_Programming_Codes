#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
    int fd = 0;
    char Fname[50];
    printf("Enter the fike name that you want to delete:");
    scanf("%s",Fname);

    unlink(Fname);
    return 0;

    
}