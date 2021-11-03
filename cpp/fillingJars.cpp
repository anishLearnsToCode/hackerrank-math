// https://www.hackerrank.com/challenges/filling-jars

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int N, M;
    long long tot = 0;
    cin >> N >> M;
    for (int i = 0; i < M; i++) {
        int a, b;
        long long k;
        cin >> a >> b >> k;
        tot += (b - a + 1) * k;
    }

    cout << tot / N << endl;
    return 0;
}

