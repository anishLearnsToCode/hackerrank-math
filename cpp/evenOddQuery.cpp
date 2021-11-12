// https://www.hackerrank.com/challenges/even-odd-query

#include <iostream>
using namespace std;

int A[100008], N;

int find(int x, int y) {
    if (A[x] % 2)
        return 1;
    if (x == y)
        return 0;
    if (A[x + 1] == 0)
        return 1;
    return 0;
}

int main() {
    int x, y, Q;
    cin >> N;
    for (int i = 1; i <= N; i++)
        cin >> A[i];
    cin >> Q;
    while (Q--) {
        cin >> x >> y;
        if (find(x, y))
            cout << "Odd" << endl;
        else
            cout << "Even" << endl;
    }
    return 0;
}

