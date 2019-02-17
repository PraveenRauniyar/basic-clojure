(defn my-take
  [n coll]
  (loop
   [c coll
    result []
    n n]
    (if (or (empty? c) (zero? n))
      result
      (recur (rest c) (conj result (first c)) (dec n)))))

(my-take 2 [1,2,3,4,5])

(defn fact [n]
  (if (<= n 1)
    1
    (* (fact (dec n)) n)))
(fact 7)

(defn my-map
  [methode coll]
  (loop
   [c coll result []]
    (if (empty? c)
      result
      (recur (rest c) (conj result (methode  (first c)))))))


(my-map inc [4,5,6,7])

; (defn isTrue [methode value]
;     (if(methode value)
;     value
;     ))


(defn my-filter
  [method coll]
  (loop [c coll filterdArray []]
    (if (empty? c)
      filterdArray
      (recur (rest c) (if (method (first c)) (conj filterdArray (first c)) filterdArray)))))

(my-filter odd? [1 2 3 4])

(defn my-filter
  [method coll]
  (loop [c coll filterdArray []]
    (if (empty? c)
      filterdArray
      (recur (rest c) (if (method (first c)) (conj filterdArray (first c)) filterdArray)))))


(defn lcm  
  [firstNumber secondNumber]
  (loop [firstNumber firstNumber multiplication 1]
    (if (zero? (rem firstNumber secondNumber))
             firstNumber
             (recur (* firstNumber multiplication) (inc multiplication)))))

(lcm 3 4)