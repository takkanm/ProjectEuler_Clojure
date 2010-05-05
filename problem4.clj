(defn kaibun-str? [s]
  (= (apply str (reverse s)) s))

(def three-digit-number (filter #(> % 99) (range 1000)))

(defn combinations
  ([xs] (if (= xs ()) ()
                      (concat (combinations (first xs) xs)
                              (combinations (rest xs)))))
  ([x xs] (map #(vector x %) xs)))

(def product-three-digit-number-combinations
  (map #(* (first %) (last %)) (combinations three-digit-number)))

(def answer
  (apply max 
    (filter #(kaibun-str? (str %)) product-three-digit-number-combinations)))
