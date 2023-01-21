//============================================================================
// Name        : Lab17_EK.cpp
// Author      : Eugene Kim
// Block       : C
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <vector>
#include <string>

using namespace std;

void input(string &largeString1, string &largeString2);
void convert(string largeString1, string largeString2, vector<int> &largeInt1, vector<int> &largeInt2);
int asciiToInt(char ch);
void add(vector<int> largeInt1, vector<int> largeInt2, vector<int> &finalInt);
void output(const vector<int> finalInt);

int main()
{
	string largeString1;
	string largeString2;

	for (int i = 0; i < 4; i++)
	{
		vector<int> largeInt1(12, 0);
		vector<int> largeInt2(12, 0);
		vector<int> finalInt(13, 0);
		input(largeString1, largeString2);
		convert(largeString1, largeString2, largeInt1, largeInt2);
		add(largeInt1, largeInt2, finalInt);
		output(finalInt);
	}

	return 0;
}
void input(string &largeString1, string &largeString2)
{
	cout << "Input:" << endl << endl;
	cin >> largeString1;
	cin >> largeString2;
}
void convert(string largeString1, string largeString2, vector<int> &largeInt1, vector<int> &largeInt2)
{
	int size1 = size(largeString1);
	int size2 = size(largeString2);
	for (int i = 0; i < size1; i++)
	{
		largeInt1[11 - i] = asciiToInt(largeString1[size1 - 1 - i]);
	}
	for (int j = 0; j < size2; j++)
	{
		largeInt2[11 - j] = asciiToInt(largeString2[size2 - 1 - j]);
	}
}
int asciiToInt(char ch)
{
	return (ch - '0');
}
void add(vector<int> largeInt1, vector<int> largeInt2, vector<int> &finalInt)
{
	for (int i = 0; i < 12; i++)
	{
		if (largeInt1[11 - i] + largeInt2[11 - i] >= 10)
		{
			finalInt[12 - i] = finalInt[12 - i] + largeInt1[11 - i] + largeInt2[11 - i] - 10;
			finalInt[12 - i - 1] = 1;
		}
		else
			finalInt[12 - i] = finalInt[12 - i] + largeInt1[11 - i] + largeInt2[11 - i];
	}
}
void output(const vector<int> finalInt)
{
	cout << endl << "Output:" << endl << endl << "The sum is: ";
	bool leadingzero = true;
	for (int i = 0; i < 13; i++)
	{
		if (finalInt[i] == 0 && leadingzero == true)
			leadingzero = true;
		else
		{
			leadingzero = false;
			cout << finalInt[i];
		}
	}
	cout << endl << endl;
}
