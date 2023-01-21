//============================================================================
// Name    : Lab7_EK.cpp
// Author      : Eugene Kim
// Block       : C block
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <iomanip>
using namespace std;

int main()
{
	cout << setiosflags(ios_base::fixed)     // do not use E notation
		 << setiosflags(ios_base::showpoint) // always show decimal point
		 << setprecision(2);                 // rounded to 2 decimal places

	double payweeks, takehomepay, totalpay;
	int weekhours;

	totalpay = 0;

	cout << "How many weeks in this pay period? ";
	cin >> payweeks;

	for (int n = 0; n < payweeks; n++)
	{
	cout << endl;
	cout << "How many hours did you work this week? ";
	cin >> weekhours;

	takehomepay = ((weekhours*7.72)*(0.67));
	cout << "Your take-home pay is $" << takehomepay << endl;

	totalpay = totalpay + takehomepay;
	}

	cout << endl;
	cout << "Your total pay for the month is $" << totalpay << endl;
	cout << "Hope you enjoy working at Babbage Burgers.";

	return 0;
}
