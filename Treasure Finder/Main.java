#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,z,large,hcf,st;
  cin>>x>>y>>z;
  if(x>=y&&x>=z)
  {
    if(y>=z)
      large=y;
    else
      large=z;
  }
  else if(y>=x&&y>=z)
  {
    if(x>=z)
      large=x;
    else
      large=z;
  }
  else
  {
    if(x>=y)
      large=x;
    else
      large=y;
  }
  cout<<"The treasure is in box which has number "<<large;
  st=x<y?(x<z?x:z):(y<z?y:z);
  for(hcf=st;hcf>=1;hcf--)
  {
    if(x%hcf==0 && y%hcf==0 && z%hcf==0)
      break;
  }
  cout<<"\nThe code to open the box is "<<hcf;
}
  
