/** COMMENTS ********************************************************/
/*	Your name: Eugene Kim
	Class block: C 				Date: 10/16/15
	Lab: 11B
	Title: Gallons of Paint
*/

/** INCLUDE FILES ***************************************************/

#include <iostream>
#include <iomanip>
using namespace std;

double dimensions(double length, double width, double height);
int addthem(int windows, int doors);
double gallons(double surfacearea, double windowsdoors);

int main()
{
	cout << setiosflags(ios_base::fixed) // do not use E notation
	<< setiosflags(ios_base::showpoint) // always show decimal pt
	<< setprecision(2); // round to two decimal places

	double length, width, height, total, surfacearea, paintgallons, paint;
	char option;
	int windows, doors, windowsdoors;
	total = 0;

	do
	{
	cout << "Enter dimensions (length width height): ";
	cin >> length >> width >> height;
	surfacearea = dimensions(length, width, height);

	cout << "Enter number of windows and doors: ";
	cin >> windows >> doors;
	windowsdoors = addthem(windows, doors);

	paintgallons = gallons(surfacearea, windowsdoors);

	cout << "That room will take " << paintgallons << " gallons of paint." << endl << endl;
	total = total + paintgallons;

	cout << "Another room (y/n)? ";
	cin >> option;
	cout << endl;

	} while(option != 'n');

	cout << "All the rooms combined will take " << total << " gallons of paint."
		 << endl
		 << endl
		 << total/1 << " gallon-containers of paint will be required." << endl;

   return 0;
}

double dimensions(double length, double width, double height)
{
	return (2 * length * height + 2 * width * height);
}
int addthem(int windows, int doors)
{
	return windows * 15 + doors * 21;
}
double gallons(double surfacearea, double windowsdoors)
{
	return (surfacearea - windowsdoors)/400;
}
