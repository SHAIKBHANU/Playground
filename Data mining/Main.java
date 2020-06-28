#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,even=0,odd=0,rem;
  cin>>n;
  while(n>0)
  {
    rem=n%10;
    if(rem%2==0)
      even=even+rem;
    else
      odd=odd+rem;
    n=n/10;
  }
  if(even==odd)
    cout<<"Yes";
  else
    cout<<"No";
}
