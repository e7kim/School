//============================================================================
// Name        : Lab14_EK.cpp
// Author      : Eugene Kim
// Block       : C
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void scorecard(string N, int hole[18]);
void ttl(int h[18]);
void oneholes(int h[18]);

int main()
{
	string name;
	int h[18];
	cout << "Enter name of player: ";
	cin >> name;

	scorecard(name, h);


	return 0;
}

void scorecard(string N, int h[18])
{

	cout << "Enter the number of strokes for each hole." << endl;

	for(int i=0; i<18; i++)
	{
		cout << "  hole[" << i+1 << "]: ";
		cin >> h[i];
	}

	cout << endl;
	cout << N << ", here is your scorecard:" << endl << endl;
	cout << "Hole :  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17 18" << endl;
	cout << "------------------------------------------------------------" << endl;
	cout << "Score:";
	for(int i=0; i<18; i++)
	{
		cout << "  " << h[i];
	}
	cout << endl << endl ;

	ttl(h);
	oneholes(h);
}
void ttl(int h[18])
{
	int total = 0;
	for(int i=0; i<18; i++)
	{
		total = total + h[i];
	}
	cout << "Your total is " << total << "." << endl;
}
void oneholes(int h[18])
{
	int holeones = 0;
	for(int i=0; i<18; i++)
	{
		if(h[i]==1)
		{
			holeones = holeones + 1;
		}
	}
	cout << "You scored " << holeones << " holes-in-one.";
}
