#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int target,score,sum=0,attempt=0;
  cin>>target;
  while(sum<target)
  {
    cin>>score;
    sum=sum+score;
    attempt++;
  }
  cout<<"The number of turns is "<<attempt;
}