from math import gcd


def probability(a: int, b: int, c: int) -> str:
    if a + b <= c:
        return '1/1'
    if a >= c and b >= c:
        x = c ** 2
        y = 2 * a * b
        hcf = gcd(x, y)
        return f'{x // hcf}/{y // hcf}'

    if a <= c and b <= c:
        x = 2 * a * b - (a - c + b) ** 2
        y = 2 * a * b
        hcf = gcd(x, y)
        return f'{x // hcf}/{y // hcf}'

    a, b = max(a, b), min(a, b)
    x = c ** 2 - (c - b) ** 2
    y = 2 * a * b
    hcf = gcd(x, y)
    return f'{x // hcf}/{y // hcf}'


test_cases = int(input())
for _ in range(test_cases):
    a, b, c = map(int, input().split())
    print(probability(a, b, c))
