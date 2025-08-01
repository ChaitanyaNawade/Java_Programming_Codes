#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
    int fd = 0;
    char Fname[50];
    printf("Enter the fike name that you want to open:");
    scanf("%s",Fname);
    
    fd = open(Fname,O_RDWR)

    if(fd == -1)
    {
        printf("unallble to open file\n");
        return -1;
    }
    else{
        printf("unable to oepn file\n");
    }

    close(fd);
    return 0;

    
}