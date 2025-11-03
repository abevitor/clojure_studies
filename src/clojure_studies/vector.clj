(ns clojure-studies.vector
  (:gen-class))

  (def v [2 4 5 8])
  

  (defn -main [& args]
  (println "O vetor é:" v)
  (println "Tamanho do vetor:" (count v))
  (println "Primeiro elemento:" (first v))
  (println "Último elemento:" (last v))
  (println "Elemento na posição 2:" (get v 2))
  (println "Novo vetor com conj:" (conj v 10)))
  