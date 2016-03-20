; Bubble sort in LISP

(defparameter *list* (list))

(dotimes (n 10)
  (defparameter *list* (append *list* (list (random 100))))
)

(defun swap(lst i j)
  (rotatef (nth i lst) (nth j lst))
)

(defun sort(lst)
  (dotimes (i (list-length lst))
    (dotimes (j (list-length lst))
      (if (< (elt lst i) (elt lst j))
        (swap *list* i j)
      )
    )
  )
)

(print *list*)
(sort *list*)
(print *list*)