// https://www.hackerrank.com/challenges/special-multiple

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

const int N = 5555;

bool was[N];
int x[N], pr[N], pd[N];

int main()
{
    int tt;
    cin >> tt;
    while (tt--)
    {
        int n;
        cin >> n;
        for (int i = 0; i < n; i++)
            was[i] = false;
        int b = 1, e = 1;
        x[1] = 9 % n;
        was[x[1]] = true;
        pr[x[1]] = -1;
        pd[x[1]] = -1;
        while (b <= e)
        {
            int nx = (x[b] * 10 + 0) % n;
            if (!was[nx])
            {
                e++;
                x[e] = nx;
                was[nx] = true;
                pr[nx] = x[b];
                pd[nx] = 0;
            }
            nx = (x[b] * 10 + 9) % n;
            if (!was[nx])
            {
                e++;
                x[e] = nx;
                was[nx] = true;
                pr[nx] = x[b];
                pd[nx] = 9;
            }
            b++;
        }
        int p = 0;
        string res = "";
        while (pr[p] != -1)
        {
            res += (char)(pd[p] + 48);
            p = pr[p];
        }
        res += "9";
        reverse(res.begin(), res.end());
        cout << res << endl;
    }
    return 0;
}

