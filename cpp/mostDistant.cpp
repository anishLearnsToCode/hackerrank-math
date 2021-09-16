#include <iostream>
#include <algorithm>
#include <math.h>

using namespace std;
int main() {
    int n;
    cin >> n;
    long long int x[n], y[n];
    int i;
    for (i = 0; i < n; i++) {
        cin >> x[i] >> y[i];
    }
    sort(x, x + n);
    sort(y, y + n);
    double d1, d2, d3, d4, d5, d6;
    d1 = abs(x[n - 1] - x[0]);
    d2 = abs(y[n - 1] - y[0]);
    d3 = abs(sqrt((x[0] * x[0]) + (y[0] * y[0])));
    d4 = abs(sqrt((x[0] * x[0]) + (y[n - 1] * y[n - 1])));
    d5 = abs(sqrt((x[n - 1] * x[n - 1]) + (y[0] * y[0])));
    d6 = abs(sqrt((x[n - 1] * x[n - 1]) + (y[n - 1] * y[n - 1])));
    double a[6];
    a[0] = d1;
    a[1] = d2;
    a[2] = d3;
    a[3] = d4;
    a[4] = d5;
    a[5] = d6;
    sort(a, a + 6);
    printf("%.6lf\n", a[5]);

    return 0;
}

