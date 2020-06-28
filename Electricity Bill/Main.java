#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int extra,units,total=0;
  float uc;
  std::cin>>units;
 if(units<=200)
 {
   uc=0.5;
   extra=0;
 }
  else if(units>200&&units<=400)
  {
    uc=0.65;
    extra=100;
  }
  else if(units>400&&units<=600)
  {
    uc=0.80;
    extra=200;
  }
  else
  {
    uc=1.25;
    extra=425;
  }
  total=(units*uc)+extra;
  std::cout<<"Rs."<<total;
}