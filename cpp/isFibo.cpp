// https://www.hackerrank.com/challenges/is-fibo

#include <iostream>
#include <set>
using namespace std;

#define ll long long

const ll MAXV = 10000000000LL;
set<ll> fibs;
void init() {
    ll a = 0, b = 1;
    while (a < MAXV) {
        fibs.insert(a);
        b += a;
        a = b - a;
    }
}

int main() {
    init();
    int t;
    cin >> t;
    while (t--) {
        ll n;
        cin >> n;
        if (fibs.count(n))
            cout << "IsFibo\n";
        else
            cout << "IsNotFibo\n";
    }
    return 0;
}

