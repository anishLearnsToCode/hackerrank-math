// https://www.hackerrank.com/challenges/halloween-party

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <bits/stdc++.h>
using namespace std;

int main() {
    int T;
    cin >> T;
    assert(1 <= T);
    assert(T <= 10);
    while (T--) {
        long long int N;
        cin >> N;
        assert(1 <= N);
        assert(N <= 10000000);
        if (N % 2 == 0) {
            cout << (N / 2) * (N / 2) << endl;
        } else {
            cout << (N / 2) * (N / 2 + 1) << endl;
        }
    }
    return 0;
}

