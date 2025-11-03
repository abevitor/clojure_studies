(ns clojure-studies.filter
  (:gen-class))


(def lista [1 2 3 4 5 6 7 8])


(defn -main [& args]
(println "filtro: " (filter (fn [number] (= (mod number 2) 0)) lista)))