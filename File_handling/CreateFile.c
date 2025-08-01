#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
    int fd = 0;
    fd = creat("Demo.txt",0777);

    if(fd == -1)
    {
        printf("Unalble to create the file\n");
    }
    else
    {
        printf("the file successfully created with fd :%d\n",fd);
    }
    return 0;
}