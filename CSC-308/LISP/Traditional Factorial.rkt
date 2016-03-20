#lang racket
(define (factorial n)
	(define (factorial_helper n accumulator)
		(if (= 0 n)
			accumulator
			(factorial_helper (- n 1) (* n accumulator))))
	(factorial_helper n 1))

(factorial 5)