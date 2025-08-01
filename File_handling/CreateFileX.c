#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
    int fd = 0;
    char Fname[50];
    printf("Enter the fike name that you want to create:");
    scanf("%s",Fname);

    fd = creat(Fname,0777);

    if(fd == -1)
    {
        printf("Unalble to create the file\n");
    }
    else
    {
        printf("the file successfully created with fd :%d\n");
    }
    return 0;
}