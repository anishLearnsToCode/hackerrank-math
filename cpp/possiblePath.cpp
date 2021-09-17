//https://www.hackerrank.com/challenges/possible-path/

#include <iostream>
using namespace std;

long long gcd(long long a, long long b) {
    return b == 0 ? a : gcd(b, a % b);
}

int main() {
    int t;
    long long a, b, x, y;
    cin >> t;
    while (t--) {
        cin >> a >> b >> x >> y;
        if (gcd(a, b) == gcd(x, y))
            cout << "YES\n";
        else
            cout << "NO\n";
    }
    return 0;
}

