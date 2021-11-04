// https://www.hackerrank.com/challenges/matrix-tracing

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

const int md = 1000000007;
const int co = 2000010;

long long fact[co + 10], inv[co + 10];

int main() {
    fact[0] = 1;
    for (int i = 1; i <= co; i++)
        fact[i] = fact[i - 1] * i % md;
    for (int i = 0; i <= co; i++) {
        int x = 1, step = 1 << 30;
        while (step > 0) {
            x = (long long)x * x % md;
            if (step & (md - 2))
                x = (long long)x * fact[i] % md;
            step >>= 1;
        }
        inv[i] = x;
    }
    int tt;
    cin >> tt;
    while (tt--) {
        int n, m;
        cin >> n >> m;
        long long ans = fact[n + m - 2];
        ans = ans * inv[n - 1] % md;
        ans = ans * inv[m - 1] % md;
        cout << ans << endl;
    }
    return 0;
}

