#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

int  main()
{
    char Fname[50];
    int fd = 0,ret =0;
    char Buffer[] = "India is my  country";
     

    printf("Enter the file namee\n");
    scanf("%s",Fname);

    fd = open(Fname, O_RDWR);
    if(fd == -1)
    {
        printf("unalbe to open file");
        return -1;
    }

    ret = write(fd,Buffer,8);

    printf("%d bytes gets written succesfully\n",ret);
    close(fd);
    return 0;
}