//============================================================================
// Name        : Lab8_EK.cpp
// Author      : Eugene Kim
// Block       : C
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main() {
	int totaltime, timewatched, movielengthminutes, movielengthhours, minutesleft;
	char movielengthoption;

	cout << "How many hours do you have to watch movies? ";
	cin >> totaltime;

	minutesleft = totaltime * 60;

	while (minutesleft > 0)
	{
		do
		{
			cout << endl;
			cout << "You will be entering the length of your next movie in..." << endl;
			cout << "A. Hours" << endl;
			cout << "B. Minutes" << endl;
			cout << "Please choose an option: ";
			cin >> movielengthoption;
		}while ((movielengthoption != 'A') && (movielengthoption != 'B'));
		if (movielengthoption == 'A')
		{
			cout << endl;
			cout << "Enter number of hours: ";
			cin >> movielengthhours;
			minutesleft = minutesleft - movielengthhours * 60;
			cout << "That's " << movielengthhours * 60 << " minutes." << endl;
		}
		if (movielengthoption == 'B')
		{
			cout << endl;
			cout << "Enter number of minutes: ";
			cin >> movielengthminutes;
			minutesleft = minutesleft - movielengthminutes;
			cout << "That's " << movielengthminutes / 60 << " hour(s) and " << movielengthminutes % 60 << " minutes." << endl;
		}
		if (minutesleft > 0)
		{
			cout << "You have " << minutesleft/60 << " hour(s) and " << minutesleft%60 << " minutes left to watch movies!" << endl;
		}
	}
	cout << "You do not have enough time to watch this movie!" << endl;
	cout << endl;
	cout << "Hope you enjoy your movie marathon!";

	return 0;
}
