#include<iostream>
using namespace std;
int main()
{
  int n,i,count=0;
  cin>>n;
  for(i=1;i<=n/2;i++)
  {
    if(n%i==0)
      count++;
  }
  if(count==1)
    cout<<"Eligible";
  else
    cout<<"Not eligible";
}