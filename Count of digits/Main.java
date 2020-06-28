#include<iostream>
int main()
{
  // Type your code here
  int n,count=0;
  std::cin>>n;
  if(n==0)
    n=1;
  while(n>0)
  {
    count++;
    n=n/10;
  }
  std::cout<<count;
}