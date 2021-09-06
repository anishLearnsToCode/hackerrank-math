#include <iostream>
#include <map>
using namespace std;
int n;
int x, y;
map<int, int> m1;
map<int, int> m2;
int main()
{
    m1.clear();
    m2.clear();
    cin >> n;
    while (n--)
    {
        cin >> x >> y;
        m1[x];
        m2[y];
    }
    if (m1.size() <= 1 || m2.size() <= 1)
    {
        cout << "YES\n";
    }
    else
    {
        cout << "NO\n";
    }
    return 0;
}