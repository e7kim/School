//============================================================================
// Name        : Lab9_EK.cpp
// Author      : Eugene Kim
// Block       : C
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main()
{
	int month, day, year, yearfirst2, yearcalculations, yearlast2, yearcalculations2;

	do
	{
		cout << "Enter your birth date (month day year): ";
		cin >> month >> day >> year;
	}while (month < 1 || month > 12 || day < 1 || day > 31 || year < 1752 || year > 2099);

	yearfirst2 = year/100;
	yearcalculations = (3-(yearfirst2%4))*2;

	yearlast2 = year%100;
	yearcalculations2 = (yearlast2/4);

	if (year%4==0 && year%100!=0 || (year/100)%4==0)
	{

	}
	else
	{

	}

	cout << "You were born on a " << endl;

	return 0;
}
