#include<iostream>
int main()
{
  int m,n,i,num,sum=0;
  std::cin>>m>>n;
  num=m+n;
  for(i=1;i<num;i++)
  {
    if(num%i==0)
      sum=sum+i;
  }
  if(num==sum)
    std::cout<<"They can read the message";
    else
      std::cout<<"They can't read the message";
    }