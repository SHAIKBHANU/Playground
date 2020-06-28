#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,a[10][10],i,j,max=0;
  cin>>r>>c;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    max=a[i][0];
    for(j=0;j<c;j++)
    {
      if(max<a[i][j])
      {
        max=a[i][j];
      }
    }
    cout<<max<<"\n";
  }  
}