//============================================================================
// Name        : Lab13_EK.cpp
// Author      : Eugene Kim
// Block       : C
// Date        : 12/2/15
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void pattern1(int N);
void pattern2(int N);
void pattern3(int N);
void pattern4(int N);

int main()
{
	int N;
	cout << "Please enter parameter N. The patterns will be drawn to height of N rows. ";
	cin >> N;
	pattern1(N);
	pattern2(N);
	pattern3(N);
	pattern4(N);

	return 0;
}

void pattern1(int N)
{
	int row, col;
	cout << endl;
	for (row = 0; row < N; row++)
	{
		for (col = row; col <= (N - 1); col++)
			cout << "*";
		cout << endl;
	}
}
void pattern2(int N)
{
	int row, col, star;
	cout << endl;
	for (row = 0; row < N; row++)
	{
		for (col = row; col <= (N - 2); col++)
		{
			cout << " ";
		}
		for (star = row; star >= 0; star--)
		{
			cout << "*";
		}
		cout << endl;
	}
}
void pattern3(int N)
{
	int row, col, star;
	cout << endl;
	for (row = 0; row < N; row++)
	{
		for (col = row; col <= (N - 2); col++)
		{
			cout << " ";
		}
		for (star = row; star >= 0; star--)
		{
			cout << "*";
		}
		for (star = row; star >= 1; star--)
		{
			cout << "*";
		}
		cout << endl;
	}
}
void pattern4(int N)
{
	cout << endl;
	for (int star = 0; star < N; star++)
	{
		cout << "*";
	}
	cout << endl;
	int n1 = (N - 1);
	for (int j = 1; j < n1; j++)
	{
		cout << "*";
		for (int i = 1; i < n1; i++)
		{
			if ((i == j) || ((n1 - i) == j))
			{
				cout << "*";
			}
			else
			{
				cout << " ";
			}
		}
		cout << "*" << endl;
	}
	for (int i = 0; i < N; i++)
	{
		cout << "*";
	}

	cout << endl;
}
