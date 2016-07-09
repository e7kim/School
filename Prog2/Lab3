//============================================================================
// Name        : Prog2Lab3_EK.cpp
// Author      : Eugene Kim
// Block       : C
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <string>
#include <iomanip>
#include <fstream>
#include <vector>
#include <algorithm>

using namespace std;

void readin(vector<int> &list);
void menu(vector<int> list);
double mean(vector<int> list);
double median(vector<int> list);
int mode(vector<int> list);
int range(vector<int> list);
double stanD(vector<int> list);

int main()
{
	vector<int> list;

	readin(list);

	system("pause");

	return 0;
}
void readin(vector<int> &list)
{
	int x;
	ifstream inFile("intlist.txt");
	if (inFile.fail())
	{
		cout << "File not found.";
		exit(1);
	}
	else
	{
		while (inFile >> x)
			list.push_back(x);
		inFile.close();
		cout << "intlist.txt has " << list.size() << " elements." << endl << endl;
		cout << "Unsorted vector: " << endl;
		for (int a = 0; a < 10; a++)
			cout << list[a] << " ";
		cout << endl;
		for (int a = 10; a < 20; a++)
			cout << list[a] << " ";
		cout << endl;
		for (int a = 20; a < 30; a++)
			cout << list[a] << " ";
		cout << endl;
		for (int a = 30; a < 40; a++)
			cout << list[a] << " ";
		cout << endl << endl;

		for (int i = 0; i < list.size(); i++)
		{
			for (int j = i; j < list.size(); j++)
			{
				if (list[i] > list[j])
				{
					int k = list[i];
					list[i] = list[j];
					list[j] = k;
				}
			}
		}
		cout << "Sorted vector: " << endl;
		for (int b = 0; b < 10; b++)
			cout << list[b] << " ";
		cout << endl;
		for (int b = 10; b < 20; b++)
			cout << list[b] << " ";
		cout << endl;
		for (int b = 20; b < 30; b++)
			cout << list[b] << " ";
		cout << endl;
		for (int b = 30; b < 40; b++)
			cout << list[b] << " ";
		cout << endl << endl;
		menu(list);
	}
}
void menu(vector<int> list)
{
	int option;
	do
	{
		cout << "The Statistics Toolkit" << endl
			<< "Choose your computation: (1) Mean, (2) Median, (3) Mode, (4) Range, (5) Standard Deviation, (6) Quit. ";
		cin >> option;
		switch (option)
		{
		case 1:
				cout << "The mean of the data set is " << mean(list);
				break;
		case 2: 
				cout << "The median of the data set is " << median(list);
				break;
		case 3: 
				cout << "The mode of the data set is " << mode(list);
				break;
		case 4: 
				cout << "The Range of the data set is " << range(list);
				break;
		case 5:
			cout << "The Standard deviation of the data set is " << stanD(list);
			break;
		case 6:
				cout << "Thank you for using The Statistics Toolkit!";
				break;
		}
		cout << endl << endl;
	} while (option != 6);
}
double mean(vector<int> list)
{
	double total = 0;
	for (int i = 0; i < list.size(); i++)
		total = total + list[i];
	return total / list.size();
}
double median(vector<int> list)
{
	if (list.size() % 2 == 0)
		return (list[list.size() / 2] + list[list.size() / 2 + 1]) / 2;
	else
		return (list[list.size() / 2 + 1]);
}
int mode(vector<int> list)
{
	int mode = 0;
/*	int lastcounter = 0, counter = 0;
	for (int i = 0; i < list.size(); i++)
	{
		if (list[i] == mode)
			counter++;
		else
		{
			if (counter > lastcounter)
				lastcounter = counter;
			mode = list[i];
		}
	}*/
	return mode;
/*	int tempCount = 1, mode = 1, lastNumber = list[0];
	for (int index = 1; index < list.size(); index++)
	{
		if (lastNumber == list[index])
			++tempCount;
		else
		{
			lastNumber = list[index];
			if (tempCount > mode)
				mode = list[index +1];
			tempCount = 0;
		}
	}
	return mode;*/
}
int range(vector<int> list)
{
	int max = list[0];
	for (int i = 0; i<list.size(); i++)
	{
		if (max < list[i])
		{
			max = list[i];
		}
	}
	int min = list[0];
	for (int i = 0; i<list.size(); i++)
	{
		if (min > list[i])
		{
			min = list[i];
		}
	}
	return max - min;
}
double stanD(vector<int> list)
{
	cout << setiosflags(ios_base::fixed) // do not use E notation
		<< setprecision(2); // round to two decimal places
	double x = mean(list);
	double numerator = 0;
	for (int i = 0; i<list.size(); i++)
	{
		numerator = numerator + (list[i] - x)*(list[i] - x);
	}
	return sqrt(numerator / (list.size()-1.));
}
