#lang racket

;
; Compare Two Numbers
;
(define (Compare number1 number2)
        (if (> number1 number2)
                (printf "~a is the larger number" number1)
                (printf "~a is the larger number" number2)
        )   
)

(Compare 123 456)