// https://www.hackerrank.com/challenges/mutual-recurrences

#include <bits/stdc++.h>

using namespace std;

const int M = 30;
const int mod = 1000000000;

int sub(int x, int y) {
    x -= y;
    if (x < 0)
        x += mod;
    return x;
}

int add(int x, int y) {
    x += y;
    if (x >= mod)
        x -= mod;
    return x;
}

int mul(int x, int y) {
    return (1ll * x * y) % mod;
}

struct Matrix {
    int a[M][M];

    Matrix() {
        for (int i = 0; i < M; ++i)
            fill(a[i], a[i] + M, 0);
    }

    int *operator[](int x) {
        return a[x];
    }

    Matrix operator*(Matrix &to) {
        Matrix ans;
        for (int i = 0; i < M; ++i)
            for (int j = 0; j < M; ++j)
                for (int k = 0; k < M; ++k)
                    ans[i][j] = add(ans[i][j], mul(a[i][k], to[k][j]));
        return ans;
    }

    vector<int> operator*(vector<int> to) {
        vector<int> ans(24);
        for (int i = 0; i < 24; ++i)
            for (int j = 0; j < 24; ++j)
                ans[i] = add(ans[i], mul(a[i][j], to[j]));
        return ans;
    }

} ONE;

Matrix bin(Matrix A, long long n) {
    Matrix B = ONE;
    while (n) {
        if (n & 1)
            B = B * A;
        A = A * A;
        n >>= 1;
    }
    return B;
}

void kill() {
    int a, b, c, d, e, f, g, h;
    cin >> a >> b >> c >> d >> e >> f >> g >> h;

    Matrix A;
    A[0][a - 1]++;
    A[0][10 + b - 1]++;
    A[0][10 + c - 1]++;
    A[0][22]++;

    A[10][10 + e - 1]++;
    A[10][f - 1]++;
    A[10][g - 1]++;
    A[10][20]++;

    for (int i = 1; i <= 9; ++i) {
        A[i][i - 1]++;
        A[i + 10][10 + i - 1]++;
    }

    A[20][20] = h;
    A[20][21] = h;
    A[21][21] = h;

    A[22][22] = d;
    A[22][23] = d;
    A[23][23] = d;

    vector<int> r(24, 1);
    r[20] = 0;
    r[21] = 1;
    r[22] = 0;
    r[23] = 1;

    long long n;
    cin >> n;

    A = bin(A, n + 1);

    r = A * r;
    cout << r[0] << " " << r[10] << endl;
}

int main() {
    for (int i = 0; i < M; ++i)
        ONE[i][i] = 1;

    int t;
    cin >> t;
    while (t--) {
        kill();
    }
    return 0;
}

