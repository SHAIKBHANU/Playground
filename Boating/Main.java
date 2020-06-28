#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z,max;
  std::cin>>x;
  std::cin>>y;
  std::cin>>z;
  max=y*75+z*30;
  if(max<x)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}