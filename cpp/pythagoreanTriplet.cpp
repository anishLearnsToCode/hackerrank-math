#include <iostream>
using namespace std;

int main()
{
    int a, b, c;
    cin >> a;

    if (a % 2 == 0)
    {
        b = ((a / 2) * (a / 2)) - 1;
        c = b + 2;
    }
    else
    {
        b = ((a * a) - 1) / 2;
        c = b + 1;
    }

    cout << a << " " << b << " " << c;

    return 0;
}