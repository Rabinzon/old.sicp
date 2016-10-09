(ns sicp.ch1)

;; ex 1.3
(defn sqr [x]
	(* x x))

(defn biggest [x, y]
	(> x y))

(defn sqr-sum [x , y]
	(+ (sqr x) (sqr y)))

(defn biggest-sqr-sum [x, y, z]
	(if (biggest x y) 
		(if (biggest y z) 
			(sqr-sum x y) 
			(sqr-sum x z)) 
		(if (biggest x z) 
			(sqr-sum x y) 
			(sqr-sum y z))))
;; end 1.3

;; ex 1.11
(defn f-rec [n]
	(if (< n 3) n 
		(+	(f-rec (- n 1))
			(f-rec (- n 2))
			(f-rec (- n 3)))))
;; end 1.11
