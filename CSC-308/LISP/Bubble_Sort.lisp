; Frances Coronel
; Bubble Sort Program
; Common LISP
; CSC 308

; defining array list with predefined values
(defparameter *list* (list 34 56 4 10 77 51 93 30 5 52))

(defun swap(array i j)
	(rotatef (nth i array) (nth j array))
  ; rotatef modifies the values of each place by rotating values from one place into another
  ; rotatef is equivalent to the following in Java:
  ; int temp = array[i];
  ; array[i] = array[j];
  ; array[j] = temp;
)

; elt - accesses the element of sequence identified by index
(defun sort(array)
  ; for (int i = 0; i < array.length-1; i++)
	(dotimes (i (list-length array))
    ; for (int j = i+1; j < array.length; j++)
		(dotimes (j (list-length array))
      ; if (array[i] > array[j]))
			(if (< (elt array i) (elt array j))
        ; perform swap on each element
				(swap *list* i j)
			)
		)
	)
)

; print unsorted array
(print "Unsorted array")
(print *list*)

; (sort '(34 56 4 10 77 51 93 30 5 52))
(sort *list*)

; print sorted array
(print "Sorted array")
(print *list*)