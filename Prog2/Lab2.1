//============================================================================
// Name        : Prog2Lab2_1_EK.cpp
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

	system("pause");

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
	int truesize = email.size() - 1, i = 0;
	string lastthree, countrycode, line;
	vector<string> countries;

	lastthree.resize(3);
	countrycode.resize(2);

	for (int i = 0; i < 3; i++)
	{
		lastthree[i] = email[truesize - (2 - i)];
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
	else
	{
		countrycode[0] = lastthree[1];
		countrycode[1] = lastthree[2];

		ifstream inFile("countries.txt");
		if (inFile.fail())
		{
			cout << "File not found.";
			exit(1);
		}
		else
		{
			string line;
			while (getline(inFile, line))
			{
				countries.push_back(line);
			}
			inFile.close();

			for (int j = 0; j < countries.size(); j++)
			{
				if (countries[j].find(countrycode) == 0)
				{
					string line = countries[j];
					cout << "Country ";
					for (int k = 5; k < countries[j].size(); k++)
					{
						cout << line[k];
					}
				}
			}
		}
	}
}
