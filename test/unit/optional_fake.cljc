(ns unit.optional-fake
  #?@(:clj  [
             (:require
               [clojure.test :refer :all]
               [unit.fake-fn-contract :refer :all]
               [clj-fakes.core :as f]
               [clj-fakes.context :as fc]
               )]
      :cljs [(:require
               [cljs.test :refer-macros [is testing]]
               [unit.fake-fn-contract :refer [testing-fake-fn-contract]]
               [clj-fakes.core :as f :include-macros true]
               [clj-fakes.context :as fc :include-macros true]
               )
             ]))

(f/-deftest
  "fake contract"
  (testing-fake-fn-contract f/optional-fake fc/optional-fake false))