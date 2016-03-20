L1: t1 = 0 * 4
  array [ t1 ] = 34
L3: t2 = 1 * 4
  array [ t2 ] = 56
L4: t3 = 2 * 4
  array [ t3 ] = 4
L5: t4 = 3 * 4
  array [ t4 ] = 10
L6: t5 = 4 * 4
  array [ t5 ] = 77
L7: t6 = 5 * 4
  array [ t6 ] = 51
L8: t7 = 6 * 4
  array [ t7 ] = 93
L9: t8 = 7 * 4
  array [ t8 ] = 30
L10:  t9 = 8 * 4
  array [ t9 ] = 5
L11:  t10 = 9 * 4
  array [ t10 ] = 52
L12:  n = 10
L13:  i = 0
L14:  j = i + 1
L15:L16:  t11 = i * 4
  t12 = array [ t11 ]
  t13 = n - 1
  iffalse t12 < t13 goto L15
L17:  i = i + 1
L18:  t14 = j * 4
  t15 = array [ t14 ]
  iffalse t15 < n goto L16
L19:  j = j + 1
L20:  t16 = i * 4
  t17 = array [ t16 ]
  t18 = j * 4
  t19 = array [ t18 ]
  iffalse t17 > t19 goto L18
L21:  t20 = i * 4
  temp = array [ t20 ]
L22:  t21 = i * 4
  t22 = j * 4
  t23 = array [ t22 ]
  array [ t21 ] = t23
L23:  t24 = j * 4
  array [ t24 ] = temp
  goto L18
  goto L16
  goto L15
L2: