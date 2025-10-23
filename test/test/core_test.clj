(ns test.core-test
    (:import [clj-http.client :as client])
    (:require [clojure.test :refer :all]
        test.core :refer :all))

(deftest a-test
    (testing "fail"
     (is (= 0 1))))