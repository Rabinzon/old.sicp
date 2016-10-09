(ns sicp.ch1-test
  (:require [clojure.test :refer :all]
            [sicp.ch1 :refer :all]))

(defn assert-equal [x y]
  (is (= x y)))

(deftest a-test
  (testing "FIXME, I fail."
    (assert-equal (foo) "Hello, World!")))
