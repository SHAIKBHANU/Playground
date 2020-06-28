#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int birth,current;
  cin>>birth;
  cin>>current;
  current=current+100;
  if(current-birth>100)
    cout<<current-birth-100;
  else
    cout<<current-birth;
}