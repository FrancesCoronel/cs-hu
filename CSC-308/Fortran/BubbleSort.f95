!
! Bubble Sort
! CSC 308
! FVCproductions
!

PROGRAM Bubble_Sort

parameter(MAX = 1024)

! array of integers

integer A(1:MAX)
  n = 10
  A = 0
  A(1) = 34;
  A(2) = 56;
  A(3) = 4;
  A(4) = 10;
  A(5) = 77
  A(6) = 51;
  A(7) = 93;
  A(8) = 30;
  A(9) = 5;
  A(10) = 52;

! print unsorted array

  print *,'Unsorted Array'
  write(*, 10) (A(i), i = 1, n)
  print *,' '

! calling bubble sort function defined below

  call BubbleSort(A, n)

! print sorted array

  print *,'Sorted Array'
  write(*, 10) (A(i), i = 1, n)
  stop

10 format(10I5)

END

! END of Bubble Sort program

! return p, q in ascending order

Subroutine Order(p,q)
integer p, q, temp
  if (p > q) then
    temp = p
    p = q
    q = temp
  end if
  return
end

! bubble sort

Subroutine BubbleSort(A, n)
integer A(1:n)
  do i = 1, n
    do j = n, i + 1, -1
      call Order(A(j - 1), A(j))
    end do
  end do
  return
end

! end of Bubble_Sort.f95 program

! Expected Output
! Unsorted Array
! 34   56    4   10   77   51   93   30    5   52
! Sorted Array
! 4    5   10   30   34   51