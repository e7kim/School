//============================================================================
// Name        : Prog2Lab5_EK.cpp
// Author      : Eugene Kim
// Block       : C
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <vector>
#include <stdlib.h>
#include <time.h>

using namespace std;

void generateship(vector<vector<int> >&field);
void fire(vector<vector<int> >&field);
void display(const vector<vector<int> >field);

int main()
{
	srand(time(0));

	vector<vector<int> >field(8);

	for (int x = 0; x < field.size(); x++)
		field[x].resize(8);

	for (int x = 0; x < field.size(); x++)
		for (int y = 0; y < field[x].size(); y++)
			field[x][y] = 0;

	generateship(field);
	fire(field);

	return 0;
}
void generateship(vector<vector<int> >&field)
{
	int row, col;
	int direction = rand() % 4;
	switch (direction)
	{
	case 0: 	row = rand() % 5 + 3;
				col = rand() % 8;
				field[row][col] = 1;
				field[row - 1][col] = 1;
				field[row - 2][col] = 1;
				field[row - 3][col] = 1;
				break;
	case 1:		row = rand() % 8;
				col = rand() % 5;
				field[row][col] = 1;
				field[row][col + 1] = 1;
				field[row][col + 2] = 1;
				field[row][col + 3] = 1;
				break;
	case 2:		row = rand() % 5;
				col = rand() % 8;
				field[row][col] = 1;
				field[row + 1][col] = 1;
				field[row + 2][col] = 1;
				field[row + 3][col] = 1;
				break;
	case 3:		row = rand() % 8;
				col = rand() % 5 + 3;
				field[row][col] = 1;
				field[row][col - 1] = 1;
				field[row][col - 2] = 1;
				field[row][col - 3] = 1;
				break;
	}
	display(field);
}
void fire(vector<vector<int> >&field)
{
	int row, col;
	int torps = 15;
	int hitcounter = 0;
	while (hitcounter != 4 && torps != 0)
	{
		cout << torps << " torpedoes remain. Fire where? ";
		cin >> row >> col;
		switch (field[row - 1][col - 1])
		{
		case 0: cout << "Miss!" << endl << endl;
			field[row - 1][col - 1] = 2;
			break;
		case 1: cout << "Hit!" << endl << endl;
			field[row - 1][col - 1] = 3;
			hitcounter = hitcounter + 1;
			break;
		case 2: cout << "Missed again!" << endl << endl;
			break;
		case 3: cout << "Hit again!" << endl << endl;
			break;
		}
		torps = torps - 1;
		display(field);
	}
	if (hitcounter == 4)
		cout << "You win!";
	else if (torps == 0)
		cout << "You are out of torpedoes! Game over.";
}
void display(const vector<vector<int> >field)
{
	for (int row = 0; row < 8; row++)
	{
		for (int col = 0; col < 8; col++)
		{
			switch (field[row][col])
			{
			case 0:		cout << ". ";
				break;
			case 1:		cout << ". ";
				break;
			case 2:		cout << "X ";
				break;
			case 3:		cout << "O ";
				break;
			}
		}
		cout << endl;
	}
}
