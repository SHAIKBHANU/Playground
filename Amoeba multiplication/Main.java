#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i,j,n,a=0,b=1,c;
  cin>>n;
  for(i=3;i<=n;i++)
  {
    c=a+b;
    a=b;
    b=c;
  }
  cout<<c;
}