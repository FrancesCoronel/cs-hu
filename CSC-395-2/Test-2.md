# CSC 395 - Test 2 Review

---

## Problem 3

E —> C
(4) —> (2)

Cipher = (a * Plain + b) mod 26
2 = (4a * b) mod 26

gcd(a, 26) = 1

a = { 1, 3, 5, 7, 9, 11, 15, 17, 19, 21, 23, 25 }

for every “a” we have a related “b”

in general affine cipher = { 0, 1, … 25 }

12 x 26 = a x b

total of 12 keys overall

---

## Problem 5

C = K + P

V P1 does not equal P2 —> E (K, P1) does not equal E(K, P2)

M -> N

not N -> not M

E (K, P1)  = E(K, P2) —> P1 = P2

K + P1 = K + P2 —> P2 = P2

for all values of K, it is always one to one (not matter what the key is)
