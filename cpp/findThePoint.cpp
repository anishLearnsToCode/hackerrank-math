#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    int T;
    cin >> T;
    if ((1 <= T) && (T <= 15)) {

        int x1, y1, x2, y2;
        for (int i = 0; i < T; i++) {
            cin >> x1 >> y1 >> x2 >> y2;
            if ((x1 == x2) && (y1 == y2)) {
                cout << x1 << " " << y1 << endl;
                continue;
            }
            int x3 = x2 + (x2 - x1);
            cout << x3 << " " << ((y2 - y1) * x3 + (x2 * y1) - (y2 * x1)) / (x2 - x1) << endl;
        }
    }
    return 0;
}

