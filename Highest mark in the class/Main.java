#include<iostream>
int main()
{
  // Type your code here
  int n;
  std::cin>>n;
  int a[n],i,max=0;
  for(i=0;i<n;i++)
    std::cin>>a[i];
  for(i=0;i<n;i++)
  {
    if(a[i]>max)
      max=a[i];
  }
  std::cout<<max;
}