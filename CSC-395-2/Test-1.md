# CSC 395 - Test 1 Review

> bring ti-89 calculator!

---

## Problem 1

P -> C

C = ap+b mod 26

> cipher

B - highest occurrence
U - second highest occurrence

> english language

E - highest occurrence
T - second highest occurrence

0 1 2 3 …
a b c d …

e   b   t   u
x1  y1  x2  y2

solve for a and b

y1 = a * x1 + b mod 26
y2 = a * x2 + b mod 26

y1 = a * x1 + b mod 26
(b) = a * (e) + b mod 26
1 = a * 4 + b mod 26
1 = 4a + b mod 26

y2 = a * x2 + b mod 26
(u) = a * (t) + b mod 26
20 = a * 19 + b mod 26
20 = 19a + b mod 26

ergo…
1 = 4a + b mod 26
20 = 19 a + b mod 26

19 = 15a mod 26
a = 15^-1 * 19 mod 26
a = 7 * 19 mod 26
a = 3

1 = 4(3) + b mod 26
1 = 12 + b mod 26
b = 15

solve for a and b

---

## Problem 2

multiplicative inverse

so for Z(12), Z(13), and Z(14)

8^-1 * 8 = 1 mod 12
gcd (8, 12) = 4 which is not equal to 1
so DNE

8^-1 * 8 = 1 mod 13
8^-1 = 5
40 = 39 + 1
the answer is 5

8^-1 * 8 = 1 mod 14
gcd (8, 14) = 2 which is not equal to 1
so DNE

---

## Problem 6

gcd (a, 26) = 1
c = (ap + b) mod 26
p = a^-1 (c-b) mod 26

results in 2 different cipher texts that are unique

