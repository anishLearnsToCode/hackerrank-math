#include <iostream>
#include <iomanip>
#include <cstdio>
#include <vector>
using namespace std;

const int N = 50;
int t, n, arr[N];
double dp[N + 1];

int main() {
    for (cin >> t; t--;) {
        cin >> n;
        for (int i = 0; i < n; i++) {
            cin >> arr[i];
        }
        double result = 0;
        for (int i = 0; i < n; i++) {
            int gte = 0;
            for (int j = 0; j < n; j++)
                if (arr[i] <= arr[j])
                    gte++;
            gte--;
            for (int j = 1; j <= n; j++) {
                dp[0] = j;
                for (int k = 1; k < j; k++) {
                    double p = (double)gte / (double)(n - j + k);
                    dp[k] = p * (j - k) + (1 - p) * dp[k - 1];
                }
                result += dp[j - 1] / n;
            }
        }
        cout.precision(2);
        cout.setf(ios::fixed | ios::showpoint);
        cout << result << endl;
    }
    return 0;
}

