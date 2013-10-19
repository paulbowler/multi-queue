(ns multi-queue.core)

(defn invert [coll k] (not (get coll k)))

(def waiting-list [
              {:name "James" :special false, :miles 0, :catchment true}
              {:name "Fred" :special false, :miles 10, :catchment false}
              {:name "Bob" :special false, :miles 50, :catchment false}
              {:name "Jim" :special true, :miles 20, :catchment false}
              {:name "Paul" :special true, :miles 1, :catchment true}
              {:name "Bert" :special false, :miles 5, :catchment true}
              ])

(sort-by (apply juxt [#(invert % :special) #(invert % :catchment) :miles]) waiting-list)
