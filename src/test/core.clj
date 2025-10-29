(ns test.core
    (:require [clj-http.client :as client])
    (:require [clojure.data.json :as json])
    (:require [clojure.java.io :as io])
    (:import [test JavaExample])
    (:gen-class))

(def bitLimit 2147483647)

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

(defn forLoop [num] 
    (dotimes [x (+ 1 num)]
        (println x)))

(defn recuring [i] 
    (loop [i 0]
  (if (< i 10)
    (recur (inc i))
    i)))

(defn readJsonFile [filePath key]
    (println (get (json/read-str (slurp filePath)) key)))

(defn -main
    "example"
    [& args]
    
    (readJsonFile "resources/test.json" "test2"))