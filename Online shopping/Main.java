#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int f1,f2,f3,s1,s2,s3,a1,a2,a3;
  int f,s,a;
  cin>>f1>>f2>>f3>>s1>>s2>>s3>>a1>>a2>>a3;
  f=(f1-f1*f2/100)+f3;
  s=(s1-s1*s2/100)+s3;
  a=(a1-a1*a2/100)+a3;
    cout<<"In Flipkart Rs."<<f;
	cout<<"\nIn Snapdeal Rs."<<s;
  	cout<<"\nIn Amazon Rs."<<a;
  if(f<=s&&f<=a)
    cout<<"\nHe will prefer Flipkart";
  else if(s<=f&&s<=a)
    cout<<"\nHe will prefer Snapdeal";
  else
    cout<<"\nHe will prefer Amazon";
}
