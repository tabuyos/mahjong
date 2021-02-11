(ns com.tabuyos.mahjong.application.MahjongApplication)
(require '[com.tabuyos.mahjong.util.Mahjong :as mahjong])
(use '[com.tabuyos.mahjong.util.Moon :only [moon moon1]])
(use '[com.tabuyos.mahjong.util.Container :only [get-instance]])
(import [java.util Calendar])

(defn -main-old [& args]
  (println args)
  (println (:1 mahjong/dot))
  (moon)
  (get-instance)
  (moon1)
  (println (Calendar/getInstance))
  (println (.toUpperCase "tabuyos"))
  (println (. "tabuyos" indexOf "u"))
  (prn "this is prn method, now you saw the message with double quote.")
  (println "hello, tabuyos."))

(defn -main [& _]
  ;;(println (get (:1 constant/dot) 2))
  ;;(println (subvec (:4 constant/bam) 1))
  ;;(println (subvec (:6 constant/cha) 3))
  ;;(println (mahjong/get-with-lack))
  (mahjong/random-deal)
  )