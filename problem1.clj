(defn sum-of-multiples-of-3-or-5 [xs]
  (reduce + (filter #(or (= 0 (mod % 3)) (= 0 (mod % 5))) xs)))

(def answer (sum-of-multiples-of-3-or-5 (range 1000)))
