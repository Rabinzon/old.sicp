(ns sicp.ch1-test
	(:require [clojure.test :refer :all]
		[sicp.ch1 :refer :all]))

(defn assert-equal [x y]
	(is (= x y)))

(deftest ch1-1-3-test
	(testing "biggest-sqr-sum is failed"
		(assert-equal (biggest-sqr-sum 2 2 3) 13)
		(assert-equal (biggest-sqr-sum 1 2 0) 5)
		(assert-equal (biggest-sqr-sum 2 0 1) 5)))

(deftest ch1-1-11-test
	(testing "f-rec is failed"
		(assert-equal (f-rec 2) 2)
		(assert-equal (f-rec 5) 11)
		(assert-equal (f-rec 3) 3)))

(deftest ch1-1-16-test
	(testing "fast-expt is failed"
		(assert-equal (fast-expt 2 2) 4)
		(assert-equal (fast-expt 36 2) 1296)))


