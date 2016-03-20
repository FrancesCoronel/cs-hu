       program-id. BubbleSort as "BubbleSort.Program1".
      
       data division.
       working-storage section.
      * define array
       01 arraydata value ' 34 56  4 10 77 51 93 30  5 52'.
           05 array occurs 10 times pic 999.
           
       01 displayarray pic zz9.
       01 spacing pic 99 value 1.
       01 i pic 99.
       01 j pic 99.
       01 sizeof pic 99.
       01 temp pic 99.
       
       procedure division.
      * print unsorted array
           display 'Unsorted Array' at line 1 column 1.
           divide length of arraydata by length of array giving sizeof.
           perform varying i from 1 by 1 until i is greater than sizeof
               move array(i) to displayarray
               display displayarray at line 2 column spacing
               add 3 to spacing
           end-perform.
           display " ".
      * bubble sort
           perform varying i from 1 by 1 until i is equal to sizeof
               perform varying j from i by 1 until j is greater than sizeof
                   if array(j) is less than array(i) then
                       move array(i) to temp
                       move array(j) to array(i)
                       move temp to array(j)
                   end-if
               end-perform
           end-perform.
      * print sorted array
           display 'Sorted Array'.
           divide length of arraydata by length of array giving sizeof.
           perform varying i from 1 by 1 until i is greater than sizeof
               move array(i) to displayarray
               display displayarray at line number 4 column spacing
               add 3 to spacing
           end-perform.
           display " ".
        
       end program BubbleSort.
