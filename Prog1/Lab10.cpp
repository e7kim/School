/** COMMENTS ********************************************************/
/*	Your name: Eugene Kim
	Class block: C				Date: 10/8/15
	Lab: 10
	Title: Introduction to Functions
	Objective:
*/

#include <iostream>	//	input output commands:	cout & cin
using namespace std;

char rock(int w);
double paper(int x, int y);
bool scissors(int z);
int main()
{
	int i = 10, j = 21;
	char a;
	double half_sum;
	bool mult3;

	a = rock(i);
	if (a == 'E')
		cout << i << " is even" << endl;

	else
		cout << i << " is odd" << endl;

	half_sum = paper (i, j);
	cout << half_sum << endl;

	mult3 = scissors(j);
	if (mult3)
		cout << j << " is 3*" << endl;
	else
		cout << j << " is not 3*" << endl;

	return 0;
}


char rock(int p)
{
	char letter;
	if (p%2 == 0) letter = 'E';
	else letter = 'O';
	return letter;
}
double paper(int q, int r)
{
	return (double) (q + r)/2.0;
}
bool scissors(int s)
{
	if (s%3 == 0)
		return true;
	else return false;
}
