//============================================================================
// Name        : Lab16_EK.cpp
// Author      : Eugene Kim
// Block       : C
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <vector> 
#include <cstdlib>
#include <ctime>

using namespace std;

void getRandoms(vector<int> &random);
void getGuesses(vector<int> &guess);
bool checkGuesses(vector<int> random, vector<int> guess);

int main()
{
	srand(time(0));
	vector<int> random(4, 0);
	vector<int> guess(4, 0);
	getRandoms(random);
	bool result;

	cout << "Welcome to Mastermind" << endl << endl;

	do
	{
		getGuesses(guess);
		result = checkGuesses(random, guess);
	}while (result != true);

	cout << "Correct!" << endl << endl << "You are a MasterMind!";

	return 0;
}

void getRandoms(vector<int> &random)
{
	for (int i = 0; i < 4; i++)
	{
		random[i] = (rand() % 6) + 1;
	}
	/*cout << "answer key: " << random[0] << " " << random[1] << " " << random[2] << " " << random[3] << endl;*/
}
void getGuesses(vector<int> &guess)
{
	cout << "Please enter your four numerical guesses (space separated): ";
	for (int i = 0; i < 4; i++)
		cin >> guess[i];
	cout << endl;
}
bool checkGuesses(vector<int> random, vector<int> guess)
{
	int clocat = 0;
	int cnumb = 0;
	for (int i = 0; i < 4; i++)
	{
		if (guess[i] == random[i])
		{
			clocat = clocat + 1;
			guess[i] = random[i] = -1;
		}
	}
	for (int i = 0; i < 4; i++)
	{
		for (int j = 0; j < 4; j++)
		{
			if (i != j && guess[i] == random[j] && guess[i] != -1 && random[j] != -1)
			{
				cnumb = cnumb + 1;
				guess[i] = random[j] = -1;
			}
		}
	}
	if (clocat == 4)
		return true;
	else
	{
		cout << "You have " << cnumb << " correct number(s) and " << clocat << " correct location(s)." << endl << endl;
		return false;
	}
}
