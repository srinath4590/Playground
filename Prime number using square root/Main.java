#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    //cout << "Hello, World!";
  int n, check=0;
  cin>>n;
  for(int i=2;i<n;i++){
    if(n%i==0){
      check=1;
      break;}
    else
      continue;
  }
  if(check==0)
    cout<<"Given number is a prime number";
  else
    cout<<"Given number is not a prime number";
    return 0;
}
  