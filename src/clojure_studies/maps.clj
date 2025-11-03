(ns clojure-studies.maps
  (:gen-class))

(def m {"nome" "Vitor" "familia" "Barbosa"})

(defn -main [& args]
  (println "O mapa é:" m)
  (println "Tamanho do mapa:" (count m))
  (println "Primeiro par (chave + valor):" (first m))
  (println "Último par (chave + valor):" (last m))
  (println "Valor da chave 'nome':" (get m "nome"))
  (println "Mapa com novo par:" (conj m {"idade" 30})))
