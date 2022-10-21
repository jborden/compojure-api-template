(ns {{name}}.dev
    (:require {{name}}.db
              {{name}}.server))

(defn dev-init []
  ({{name}}.server/start-server!)
  ;; db conn is disabled by default
  #_({{name}}.db/init-db-conn!))
