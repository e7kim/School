/** COMMENTS ********************************************************/
/*	Your name: Eugene Kim
/** INCLUDE FILES ***************************************************/

#include <iostream>
#include <iomanip>
#include <cmath>
using namespace std;

/** PROTOTYPES ******************************************************/
void getScores(int &a, int &b, int &c);
int min(int a, int b, int c);
int max(int a, int b, int c);
double average(int a, int b, int c);
double standardDev(int a, int b, int c);

/** MAIN FUNCTION ***************************************************/
int main()
{
/** VARIABLE DECLARATION ***************************************/
	int a, b, c;
	double minimum, maximum, avg, sD;
	char option = 'n';

/** PROCESS *****************************************************/
	do
	{
	if(option=='y')
		cout << endl;
	getScores (a, b, c);
	minimum = min (a, b, c);
	maximum = max (a, b, c);
	avg = average (a, b, c);
	sD = standardDev (a, b, c);
	cout << "The student's statistics are:"
		 << endl
		 << "Minimum = " << minimum << "  Maximum = " << maximum << "  Average = " << avg << "  Standard Deviation = " << sD
		 << endl
		 << endl
		 << "Do you want to calculate the statistics for another student? (y/n): ";
	cin >> option;
	} while(option != 'n');

	cout << "Thanks for using my Basic Statistics program.";

	return 0;
}


/** FUNCTIONS ******************************************************/
void getScores(int &a, int &b, int &c)
{
	cout << "Enter the three test scores for the student, separated by a space: ";
	cin >> a >> b >> c;
}


int min(int a, int b, int c)
{
	if(a <= b & a <= c)
	{
		return a;
	}
	else if(b <= a & b <= c)
	{
		return b;
	}
	else return c;
}


int max(int a, int b, int c)
{
	if(a >= b & a >= c)
	{
		return a;
	}
	else if(b >= a & b >= c)
	{
		return b;
	}
	else return c;
}


double average(int a, int b, int c)
{
	cout << setiosflags(ios_base::fixed) // do not use E notation
	<< setprecision(2); // round to two decimal places
	return double (a+b+c)/3;
}


double standardDev(int a, int b, int c)
{
	cout << setiosflags(ios_base::fixed) // do not use E notation
	<< setprecision(2); // round to two decimal places
	double x = average(a, b, c);
	double y = 2;
	double parta = pow((double)a - x, y);
	double partb = pow((double)b - x, y);
	double partc = pow((double)c - x, y);
	double insidenumber = ((parta+partb+partc)/(2));
	return sqrt(insidenumber);
}
