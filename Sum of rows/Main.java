#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j,a[10][10],sum=0;
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
    sum=0;
    for(j=0;j<c;j++){
      sum=sum+a[i][j];
    }
    cout<<sum<<"\n";
  }
}