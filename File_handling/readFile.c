#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

int  main()
{
    char Fname[50];
    int fd = 0,ret =0;
    char Buffer[50] ={'\0'};
     

    printf("Enter the file namee\n");
    scanf("%s",Fname);

    fd = open(Fname, O_RDONLY);
    if(fd == -1)
    {
        printf("unalbe to open file");
        return -1;
    }

    ret = read(fd,Buffer,5);

    printf("%d bytes gets read succesfully\n",ret);
    printf("Data from file is %s\n",Buffer);  

    close(fd);
    return 0;
}