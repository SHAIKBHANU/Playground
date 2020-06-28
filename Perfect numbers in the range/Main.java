#include<iostream>
int main()
{
  int m,n,i,j,sum=0;
  std::cin>>m>>n;
  for(i=m;i<=n;i++)
  {
    sum=0;
    for(j=1;j<i;j++)
    {
      if(i%j==0)
        sum=sum+j;
    }
    if(sum==i)
      std::cout<<i<<" ";
  }
}