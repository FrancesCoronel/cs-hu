       identification division.
       program-id. Add.

       environment division.
       configuration section.

       data division.
       working-storage section.
       01  number1 pic 999999.
       01  number2 pic 999999.
       01  result pic zzzz9.

       procedure division.
           display "Enter the first number".
           accept number1.
           display "Enter the second number".
           accept number2.
           add number1 to number2 giving result.
           display "The sum is " result.

       end program Add.