#lang racket

; Frances Coronel
; Bubble Sort Program
; LISP

; uses recursion to sort
; no loops
; no variables like i, j, and temp are needed
; still need array variable for array to be sorted

(define (sort array)
  (define len (vector-length v))
  (define ref vector-ref)
  (printf (array))
)

    for (int i = 0; i < array.length-1; i++) {
      for (int j = i+1; j < array.length; j++) {
        if (array[i] > array[j]) {
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }

; invoking LISP sort function
; sort array in ascending order
; automatically displays array when sort function completes


; output should be following:
; Welcome to DrRacket, version 5.3.4 [3m].
; Language: racket; memory limit: 128 MB.
; '(4 5 10 30 34 51 52 56 77 93)
