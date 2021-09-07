#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <iomanip>
#include <algorithm>
using namespace std;

int main() {
    int N;
    cin >> N;

    cout << fixed;
    cout << setprecision(1);
    double total = 0;
    for (int i = 0; i < N; i++) {
        int cur;
        cin >> cur;
        total += 0.5 * cur;
    }

    cout << total << endl;

    return 0;
}