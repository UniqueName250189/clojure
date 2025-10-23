(ns test.core
    (:require [clj-http.client :as client])
    (:import [java.util ArrayList])
    (:import [test JavaExample])
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

(defn javaArrayLoop [javaArray]
    (println (ArrayList)))

(defn -main
    "example"
    [& args]
    (JavaExample/addIntToArrayList 1)
    (JavaExample/addIntToArrayList 2)
    (JavaExample/addIntToArrayList 3)
    (JavaExample/addIntToArrayList 4)
    (JavaExample/addIntToArrayList 5)
    
    (println (JavaExample/returnArrayList)))