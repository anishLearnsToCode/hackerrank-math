#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int n;
    cin >> n;
    int best = -1, ans = 1;
    for (int i = 1; i <= n; i++) {
        if (n % i != 0) {
            continue;
        }
        int s = 0;
        int x = i;
        while (x > 0) {
            s += x % 10;
            x /= 10;
        }
        if (s > best) {
            best = s;
            ans = i;
        }
    }
    cout << ans << endl;
    return 0;
}

