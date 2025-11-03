(ns clojure-studies.core
  (:gen-class))

(defn get-double
[number name]
(let [double-value (* number 2)]
(str "Olá " name ", o dobro de " number " é " double-value)))

(defn -main [& args]
  (println (get-double 4 "Claudson")))
