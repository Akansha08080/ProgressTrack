#include<stdio.h>
int main()
{
int i, count=0;
int num;

printf("enter any number:");
scanf("%d",&num);

  for(i=2;i<=num-1;i++)
  {

    if(num%i==0)
    {
        count=count+1;
      
    }
  }
  if(count>1)
  {
    printf("Its not a prime number");
  }
  else
  {
    printf("Its a prime number");
  }

  
  
}
