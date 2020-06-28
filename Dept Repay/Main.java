#include<iostream>
using namespace std;
int main()
{
  int p,t,r;
  float si;
  cin>>p>>r>>t;
  si=p*t*r/100;
  cout<<si;
  cout<<"\n";
  cout<<si+p;
  cout<<"\n";
  cout<<0.02*(si);
  cout<<"\n";
  cout<<(si+p)-(0.02*si);
  //Type your code here.
}