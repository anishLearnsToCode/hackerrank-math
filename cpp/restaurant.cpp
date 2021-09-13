#include <iostream>
using namespace std;

int gcd(int a, int b) {
    if (a == 0) {
        return b;
    } else if (b == 0) {
        return a;
    } else {
        return gcd(b, a % b);
    }
}

int main() {
    int n;
    cin >> n;

    while (n--) {
        int a, b;
        cin >> a >> b;

        cout << (a * b) / (gcd(a, b) * gcd(a, b)) << "\n";
    }

    return 0;
}

