#include <iostream>
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   //Your code goes here
  student s1;
  std::gets(s1.name);
  std::cin>>s1.roll;
  std::cin>>s1.marks;
  std::cout<<"\nStudent Details"<<" \n";
  std::cout<<"Name: "<<s1.name<<" \n";
  std::cout<<"Roll: "<<s1.roll<<" \n";
  std::cout<<"Marks: "<<s1.marks<<" \n";
  return 0;
}