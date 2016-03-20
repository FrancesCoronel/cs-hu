      *****************************************************************
      *                                                               *
      * Compare Two Numbers                                           *
      *                                                               *
      *****************************************************************
       identification division.
       program-id. Compare.

       environment division.
       configuration section.

       data division.
       working-storage section.
       01  number1 pic zzzz9.
       01  number2 pic zzzz9.
       
       procedure division.
           display "Enter the first number".
           accept number1.
           display "Enter the second number".
           accept number2.
           if number1 is greater than or equal to number2
               display number1 " is the larger number"
           else
               display number2 " is the larger number"
           end-if

       end program Compare.