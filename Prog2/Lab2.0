//============================================================================
// Name        : Prog2Lab2_0_EK.cpp
// Author      : Eugene Kim
// Block       : C
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <iomanip>
#include <string>
#include <vector>
#include <fstream>
#include <stdlib.h>

using namespace std;

void readLine(vector<string> &playlist);
void timeAuthorLine(const vector<string> playlist, vector<string> &author, vector<string> &name, int &totaltime, vector<int> &min, vector<int> &sec1, vector<int> &sec2);
void displayData(const vector<string> playlist, const vector<string> author, const vector<string> name, int totaltime, const vector<int> min, const vector<int> sec1, const vector<int> sec2);

int main()
{
	vector<string> playlist;

	readLine(playlist);

	system("pause");

	return 0;
}
void readLine(vector<string> &playlist)
{
	string line;
	vector<string> author, name;
	vector<int> min, sec1, sec2;
	int totaltime = 0;
	ifstream inFile("Playlist.txt");
	if (inFile.fail())
	{
		cout << "File not found.";
			exit(1);
	}
	else
	{
		while (getline(inFile, line))
		{
			cout << line << endl;
			playlist.push_back(line);
		}
		inFile.close();
		timeAuthorLine(playlist, author, name, totaltime, min, sec1, sec2);
		displayData(playlist, author, name, totaltime, min, sec1, sec2);
	}
}
void timeAuthorLine(const vector<string> playlist, vector<string> &author, vector<string> &name, int &totaltime, vector<int> &min, vector<int> &sec1, vector<int> &sec2)
{
	for (int i = 0; i < playlist.size(); i++)
	{
		string thisline = playlist[i];
		int index = playlist[i].find(":");
//		min[i] = thisline[index - 1] - '0';
		min[i] = atoi(thisline[index - 1].c_char());
		cout << min[i];
//		sec1[i] = thisline[index + 1] - '0';
		sec1[i] = atoi(thisline[index + 1].c_str());
		cout << sec1[i];
//		sec2[i] = thisline[index + 2] - '0';
		sec2[i] = atoi(thisline[index + 2].c_str());
		cout << sec2[i];
		totaltime = totaltime + 60 * min[i] + 10 * sec1[i] + sec2[i];
		for (int j = index + 4; j < thisline.size(); j++)
		{
			author[i] = thisline[j];
		}
		for (int k = 1; k < index - 4; k++)
		{
			name[i] = thisline[k];
		}
	}
}
void displayData(const vector<string> playlist, const vector<string> author, const vector<string> name, int totaltime, const vector<int> min, const vector<int> sec1, const vector<int> sec2)
{
	cout << playlist[0] << endl;
	cout << "-----------------------------------------------------" << endl;
	for (int i = 0; i < playlist.size(); i++)
	{
		if ((i + 1) < 10)
			cout << " " << i + 1 << ".  ";
		else
			cout << i + 1 << ".  ";
		cout << min[i] << ":" << sec1[i] << sec2[i] << " " << name[i] << " by " << author[i] << endl;
	}
	cout << "-----------------------------------------------------" << endl;
	cout << "Total Playing Time = " << totaltime / 3600 << ":";
	if ((totaltime % 3600) / 60 < 10)
		cout << "0" << (totaltime % 3600) / 60 << ":";
	else
		cout << (totaltime % 3600) / 60 << ":";
	if ((totaltime % 3600) % 60 < 10)
		cout << "0" << (totaltime % 3600) % 60;
	else
		cout << (totaltime % 3600) % 60;
}
