identification division.
program-id. BubbleSort

environment division.
configuration section.

data division.
working-storage section.
01 arraydata value ' 34 56 4 10 77 51 93 30 5 52'.
  05 array occurs 10 times pic 999.

01 displayarray pic zz9.
01 spacing pic 99 value 1.
01 spacing2 pic 99 value 1.
01 i pic 99.
01 j pic 99.
01 temp pic 99.
01 sizeof pic 999.

procedure division.

compute sizeof = length of arraydata / length of array.
display "Unsorted Array".
perform varying i from 1 by 1 until i is greater than sizeof
move array(i) to displayarray
display displayarray at line number 2 column spacing
add 3 to spacing
end-perform.
display " ".

move 1 to i.
perform until i > sizeof
move i to j
perform until j > sizeof
if (array(i) > array(j))
move array(i) to temp
move array(j) to array(i)
move temp to array(j)
end-if
add 1 to j giving j
end-perform
add 1 to i giving i
end-perform
move 0 to i

display "Sorted Array" at line 4 column 1.
move 1 to spacing2
perform varying i from 1 by 1 until i is greater than sizeof
move array(i) to displayarray
display displayarray at line number 5 column spacing2
add 3 to spacing2
end-perform.
display " ".

end program BubbleSort.
