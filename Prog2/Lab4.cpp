//============================================================================
// Name        : Prog2Lab4_EK.cpp
// Author      : Eugene Kim
// Block       : C
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>

using namespace std;

void quarterscores(int scoreboard[2][6]);
void halfscores(int scoreboard[2][6]);
void finalscores(int scoreboard[2][6]);
void displayscores(const int scoreboard[2][6]);
void winner(const int scoreboard[2][6]);
void mostquarter(const int scoreboard[2][6]);

int main()
{
	int scoreboard[2][6];

	quarterscores(scoreboard);
	halfscores(scoreboard);
	finalscores(scoreboard);
	displayscores(scoreboard);
	winner(scoreboard);
	mostquarter(scoreboard);

	return 0;
}
void quarterscores(int scoreboard[2][6])
{
	cout << "Input points scored in 1st Qtr. by Visiting Team and Home Team (separate scores with a space): ";
	cin >> scoreboard[0][0] >> scoreboard[1][0];
	cout << "Input points scored in 2nd Qtr. by Visiting Team and Home Team (separate scores with a space): ";
	cin >> scoreboard[0][1] >> scoreboard[1][1];
	cout << "Input points scored in 3rd Qtr. by Visiting Team and Home Team (separate scores with a space): ";
	cin >> scoreboard[0][3] >> scoreboard[1][3];
	cout << "Input points scored in 4th Qtr. by Visiting Team and Home Team (separate scores with a space): ";
	cin >> scoreboard[0][4] >> scoreboard[1][4];
}
void halfscores(int scoreboard[2][6])
{
	scoreboard[0][2] = scoreboard[0][0] + scoreboard[0][1];
	scoreboard[1][2] = scoreboard[1][0] + scoreboard[1][1];
}
void finalscores(int scoreboard[2][6])
{
	scoreboard[0][5] = scoreboard[0][0] + scoreboard[0][1] + scoreboard[0][3] + scoreboard[0][4];
	scoreboard[1][5] = scoreboard[1][0] + scoreboard[1][1] + scoreboard[1][3] + scoreboard[1][4];
}
void displayscores(const int scoreboard[2][6])
{
	cout << "                1st Qtr.    2nd Qtr.    Halftime    3rd Qtr.    4th Qtr.    Final" << endl
		<< "Visiting Team    " << scoreboard[0][0] << "    " << scoreboard[0][1] << "    " << scoreboard[0][2] << "    " << scoreboard[0][3] << "    " << scoreboard[0][4] << "    " << scoreboard[0][5] << "    " << endl
		<< " Home Team     " << scoreboard[1][0] << "    " << scoreboard[1][1] << "    " << scoreboard[1][2] << "    " << scoreboard[1][3] << "    " << scoreboard[1][4] << "    " << scoreboard[1][5] << "    " << endl;
}
void winner(const int scoreboard[2][6])
{
	if (scoreboard[0][5] > scoreboard[1][5])
		cout << "The Visiting Team won!" << endl;
	if (scoreboard[0][5] < scoreboard[1][5])
		cout << "The Home Team won!" << endl;
	if (scoreboard[0][5] == scoreboard[1][5])
		cout << "The game is tied!" << endl;
}
void mostquarter(const int scoreboard[2][6])
{
	int total[4];
	total[0] = scoreboard[0][0] + scoreboard[1][0];
	total[1] = scoreboard[0][1] + scoreboard[1][1];
	total[2] = scoreboard[0][3] + scoreboard[1][3];
	total[3] = scoreboard[0][4] + scoreboard[1][4];

	int max = total[0];
	int qtrnumber = 1;

	for (int i = 0; i < 4; i++)
	{
		if (max < total[i])
		{
			max = total[i];
			qtrnumber = i + 1;
		}
	}
	cout << "The most total points were scored in Quarter " << qtrnumber;
}
