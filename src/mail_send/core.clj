;Copyright 2016 Daniel Cunha
;
;Licensed under the Apache License, Version 2.0 (the "License");
;you may not use this file except in compliance with the License.
;You may obtain a copy of the License at
;
;http://www.apache.org/licenses/LICENSE-2.0
;
;Unless required by applicable law or agreed to in writing, software
;distributed under the License is distributed on an "AS IS" BASIS,
;WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
;See the License for the specific language governing permissions and
;limitations under the License.

(ns mail-send.core
  (:require [environ.core :refer :all]
            [postal.core :as postal])
  (:gen-class))

(defn -main
  []
  (postal/send-message {:host (:host env)
                 :user (:username env)
                 :pass (:password env)
                 :ssl :yes}
                {:from (str (:username env) "@gmail.com")
                 :to (:to env)
                 :subject (:subject env)
                 :body (:body env)}))
