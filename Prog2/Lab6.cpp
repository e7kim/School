//============================================================================
// Name        : Prog2La6_EK.cpp
// Author      : Eugene Kim
// Block       : C
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>

using namespace std;

int factorial(int n);
int fibonacci(int n);
int triangularNumber(int n);
char getChoice();				//Only allow selections of 'A,' 'B,' 'C,' & 'Q'
int getNum();					//Only allow positive numbers to be input

int main()
{
	int n;
	char answer;
	do
	{
		answer = getChoice();
		if (answer != 'Q')
			n = getNum();
		switch (answer)
		{
		case 'A': cout << "The factorial of " << n << " is "
					   << factorial(n) << "." << endl;
				  break;
		case 'B': cout << "The " << n << "th Fibonacci number is "
			           << fibonacci(n) << "." << endl;
				   	   break;
		case 'C': cout << "The " << n << "th triangular number is "
					   << triangularNumber(n) << "." << endl;
					   break;
		}
	} while (answer != 'Q');

	system("Pause");

	return 0;
}
int factorial(int n)
{
	if (n == 1)
		return 1;
	else
		return n * factorial(n - 1);
}
int fibonacci(int n)
{
	if (n == 1 || n == 2)
		return 1;
	else
		return fibonacci(n - 2) + fibonacci(n - 1);
}
int triangularNumber(int n)
{
	if (n == 1)
		return 1;
	else
		return n + triangularNumber(n - 1);
}
char getChoice()
{
	char choice;
	do
	{
		cout << "Which mathematical recursion do you pick? ('A' for factorial. 'B' for fibonacci. 'C' for triangular number. 'Q' to quit): ";
		cin >> choice;
	} while (choice != 'A' && choice != 'B' && choice != 'C' && choice != 'Q');
	return choice;
}
int getNum()
{
	int n;
	cout << "Integer number input here: ";
	cin >> n;
	return n;
}
