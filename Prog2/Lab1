//============================================================================
// Name        : Prog2Lab1_EK.cpp
// Author      : Eugene Kim
// Block       : C
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <string>

using namespace std;

void getemail(string &email);
void finduser(string email);
void findsitetype(string email);

int main()
{
	string email;
	getemail(email);
	finduser(email);
	findsitetype(email);

	return 0;
}
void getemail(string &email)
{
	cout << "Please enter your email address: ";
	cin >> email;
	cout << endl;
}
void finduser(string email)
{
	int index = email.find('@');
	cout << "Username: ";
	for (int i = 0; i < index; i++)
		cout << email[i];
	cout << endl << endl;
}
void findsitetype(string email)
{
	int truesize = size(email) - 1;
	string lastthree;
	lastthree.resize(3);
	for (int i = 0; i < 3; i++)
	{
		lastthree[i] = email[truesize - (2-i)];
	}
	cout << "Site type: ";
	if (lastthree == "edu")
		cout << "Educational institutions";
	else if (lastthree == "org")
		cout << "Not-for-profit organizations";
	else if (lastthree == "gov")
		cout << "Government entities";
	else if (lastthree == "mil")
		cout << "Military installations";
	else if (lastthree == "net")
		cout << "Network service providers";
	else if (lastthree == "com")
		cout << "Commercial ventures";
	else if (email[truesize - 2] == '.')
		cout << "Country Code " << email[truesize - 1] << email[truesize];
}
