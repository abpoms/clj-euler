(ns clj-euler.core
  [:require [clojure set]] )

(defn p1 []
  (let [mrange #(set (range 0 1000 %))]
    (apply + (clojure.set/union (mrange 3) (mrange 5)))))

(defn fib-seq
  ([]
     (fib-seq 1 1))
  ([a b]
     (cons a (lazy-seq (fib-seq b (+ b a))))))

(defn p2 []
  (apply + (filter even? (take-while (partial > 4000000) (fib-seq)))))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
