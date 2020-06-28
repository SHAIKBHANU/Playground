#include<iostream>
int main()
{
    // Type your code here
  int r,c;
  std::cin>>r>>c;
  int a[r][c],b[r][c],k[r][c],i,j;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>a[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>b[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      k[i][j]=a[i][j]+b[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cout<<k[i][j]<<" ";
    }
    std::cout<<"\n";
  }
}