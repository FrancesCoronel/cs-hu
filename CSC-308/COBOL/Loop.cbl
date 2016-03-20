      *****************************************************************
      *                                                               *
      * Loop                                                          *
      *                                                               *
      *****************************************************************
       identification division.
       program-id. Loop.

       environment division.
       configuration section.

       data division.
       working-storage section.
       01  i pic 99.
       01  displayi pic z9.
       
       procedure division.
           perform varying i from 1 by 1 until i is greater than 10
               move i to displayi
               display displayi
           end-perform.
       
       end program Loop.