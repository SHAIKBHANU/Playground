#include<iostream>
using namespace std;
int main()
{
int dollar, cent, dollar1, cent1;
int dol,cen;
std::cin>>dollar>>cent>>dollar1>>cent1;
dol=dollar+dollar1;
  cen=cent+cent1;
  while(cen>=100)
  {
    cen=cen-100;
    dol=dol+1;
  }
  cout<<dol<<"\n"<<cen;
}
