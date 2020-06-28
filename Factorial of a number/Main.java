#include<iostream>
int main(){
  // Type your code here
  int n,fact=1,i;
  std::cin>>n;
  for(i=2;i<=n;i++)
    fact=fact*i;
  std::cout<<fact;
}