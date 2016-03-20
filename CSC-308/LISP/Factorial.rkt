#lang racket

;
; Factorial
;
(define (factorial n)
        (factorial_helper n 1)
)  
  
(define (factorial_helper n accumulator)
	(if (= 0 n)
		accumulator
		(factorial_helper (- n 1) (* n accumulator))
        )
)

(factorial 5)