*****************************************************************
*                                                               *
* Frances Coronel                                               *
* COBOL PROGRAM                                                 *
* CSC 308                                                       *
*                                                               *
*****************************************************************
identification division.
program-id. BubbleSort.

environment division.
configuration section.

data division.
working-storage section.
* defining array values
01  arraydata value '34 56 4 10 77 51 93 30 5 52'.
* defining array
   05 array occurs 10 times pic 999.
* defining temp array
05 temp pic 999.
* for printing out array
01  displayarray pic zz9.
01  spacing pic 99 value 1.
* defining i and j for looping
01  i pic 99.
01  j pic 99.
* defining size of array variable
01  sizeof pic 99.


procedure division.
* defining size of array
  divide length of arraydata by length of array giving sizeof.
* unsorted array
  display "Unsorted Array"
  perform varying i from 1 by 1 until i is greater than sizeof
    move array(i) to displayarray
    display displayarray at line number 1 column spacing
    add 3 to spacing
  end-perform.
* bubble sort
  perform varying i from 1 by 1 until is sizeof add 1
    perform varying j from i add 1 by 1 until is sizeof
      if array(j) is less than array(i) then
        move array(i) to temp
        move array(j) to arr(i)
        move temp to array(j)
      end-if
    end-perform.
  end-perform.
* sorted array
  display "Sorted Array"
  perform varying i from 1 by 1 until i is greater than sizeof
    move array(i) to displayarray
    display displayarray at line number 1 column spacing
    add 3 to spacing
  end-perform.
* end program
end program BubbleSort.