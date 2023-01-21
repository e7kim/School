//============================================================================
// Name        : Lab15_EK.cpp
// Author      : Eugene Kim
// Block       : C
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <iomanip>
#include <vector>
#include <cmath>
using namespace std;

void getScores(int score[8]);
int min(int score[8]);
int max(int score[8]);
double avg(int score[8]);
double stanD(int score[8]);
int med(int score[8]);

int main()
{
	int score[8];
	char option = 'n';

	do
	{
		if (option == 'y')
			cout << endl;

		getScores(score);
		int minimum = min(score);
		int maximum = max(score);
		double average = avg(score);
		double standardDeviation = stanD(score);
		int median = med(score);

		cout << endl;
		cout << "The student's statistics are:" << endl
			<< "   Minimum = " << minimum << "   Maximum = " << maximum << endl
			<< "   Average = " << average << "   Standard Deviation = " << standardDeviation << endl
			<< "   Median = " << median << endl << endl;

		cout << "Do you want to calculate the statistics for another student? (y/n): ";
		cin >> option;
		cout << "Thanks for using my Basic Statistics program.";
	} while (option != 'n');
	cout << endl << endl;
	cout << "Thanks for using my Basic Statistics program.";

	system("pause");

	return 0;
}

void getScores(int score[8])
{
	for (int i = 0; i<8; i++)
	{
		cout << "Enter score " << i + 1 << ": ";
		cin >> score[i];
	}
}
int min(int score[8])
{
	int index = 0;
	for (int i = 0; i<8; i++)
	{
		for (int j = 0; j<8; j++)
		{
			if (score[i] <= score[j])
				index = index + 1;
		}
		if (index == 8)
			return score[i];
	}
}
int max(int score[8])
{
	int index = 0;
	for (int i = 0; i<8; i++)
	{
		for (int j = 0; j<8; j++)
		{
			if (score[i] >= score[j])
				index = index + 1;
		}
		if (index == 8)
			return score[i];
	}
}
double avg(int score[8])
{
	int total = 0;
	for (int i = 0; i<8; i++)
	{
		total = total + score[i];
	}
	return total / 8.;
}
double stanD(int score[8])
{
	cout << setiosflags(ios_base::fixed) // do not use E notation
		<< setprecision(2); // round to two decimal places
	double x = avg(score);
	double numerator = 0;
	for (int i = 0; i<8; i++)
	{
		numerator = numerator + (score[i] - x)*(score[i] - x);
	}
	return sqrt(numerator / 7.);
}
int med(int score[8])
{
	double bigmed, smallmed, median;
	for (int i = 0; i<8; i++)
	{
		int index = 0;
		for (int j = 0; j<8; j++)
		{
			if (score[i] <= score[j])
			{
				index = index + 1;
			}
		}
		if (index == 3)
		{
			bigmed = score[i];
		}
		if (index == 4)
		{
			smallmed = score[i];
		}
	}
	median = (bigmed + smallmed) / 2;
	return median;
}
