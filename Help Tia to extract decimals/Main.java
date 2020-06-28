#include<iostream>
#include<string>
int main() 
{ 
	//std::string fnum;
	//Type your code here
std::string num;
std::string substr=".";
std::cin>>num;
if (num.find(substr)!=std::string::npos) {
size_t pos = num.find('.');    
std::string str3=num.substr(pos+1);
std::cout<<"Floating part is : "<<str3;
}
else
std::cout<<"Floating part is : ";
}