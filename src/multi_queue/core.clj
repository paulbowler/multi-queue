(ns multi-queue.core)

(def waiting-list [
              {:name "Fred" :special 1, :miles 10, :catchment 0}
              {:name "Bob" :special 1, :miles 50, :catchment 1}
              {:name "Jim" :special 0, :miles 20, :catchment 1}
              {:name "Paul" :special 0, :miles 1, :catchment 1}
              {:name "Bert" :special 1, :miles 5, :catchment 0}
              ])

(sort-by (apply juxt [:special :catchment :miles]) waiting-list)
