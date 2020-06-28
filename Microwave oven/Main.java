#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  float h;
  cin>>n>>h;
  if(n==2)
  {
    h=h*1.5;
      cout<<h;
  }
  else if(n==3)
  {
    h=h*2;
      cout<<h;
  }
  else
    cout<<"Number of items is more";
}