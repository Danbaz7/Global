//Author: Daniel Obazee
//Date:08-30-2024
//CSSI 121 Lab 1
#include <iostream>
using namespace std;

int main() {
    
int quarters,dimes, nickels;

cout<<"Numbers must be non-negative integer" <<endl;
cout<< "Enter the number of quarters: ";
cin>> quarters;
cout<<endl;
cout<< "Enter the number of dimes: ";
cin>> dimes;
cout<<endl;
cout<< "Enter the number of nickels: ";
cin>> nickels;
cout<< endl;

int totalValue;
double totalValueInDollars;

quarters = quarters*25;  //value in cent
dimes = dimes * 10 ;     //value in cent
nickels = nickels * 5;   //value in cent
totalValue = quarters + dimes +nickels ;
totalValueInDollars = static_cast<double> (totalValue)/100;   //conversion to dollars

cout.setf(ios::fixed);
cout.setf(ios::showpoint);
cout.precision(1);

cout<< "The total value is: ";
cout<< totalValue <<" " <<"cents" << " ";
cout<< "or" <<" ";
cout<<"$" << totalValueInDollars;
cout<< endl;


return 0;
    
    }