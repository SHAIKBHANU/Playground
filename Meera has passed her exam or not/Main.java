#include<iostream>
int main()
{
  // Type your code here
  int n,m,c;
  std::cin>>n;
  int a[n],i;
  for(i=0;i<n;i++)
    std::cin>>a[i];
    std::cin>>m;
  for(i=0;i<n;i++)
  {
    if(a[i]==m)
    {
      c=1;
      break;
    }
    else
      c=0;
  }
  if(c==1)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
  }