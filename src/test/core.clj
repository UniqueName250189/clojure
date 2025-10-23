(ns test.core
    (:require [clj-http.client :as client])
    (import [java.JavaExample])
    (:gen-class))

(defn multi
    [num1 num2]
    (println (* num1 num2)))

(defn isSame
    [obj1 obj2]
    (println obj1 obj2)
    (if (= (str obj1) (str obj2))
        (do (println "same"))
        (do (println "different"))))

(defn http-get [url] 
    (println (client/get url)))

(defn -main
    "example"
    [& args]
    (println (src/test/JavaExample/print)))