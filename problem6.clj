(def answer
  (- (let [sum (reduce + (map inc (range 100)))] (* sum sum))
     (reduce + (map #(* (inc %) (inc %)) (range 100)))))
