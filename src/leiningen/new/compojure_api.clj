(ns leiningen.new.compojure-api
  (:require [leiningen.new.templates :refer [sanitize renderer year ->files]]))

(defn compojure-api
  "Create a new compojure api project"
  [name]
  (let [data   {:name      name
                :sanitized (sanitize name)
                :year      year}
        render #((renderer "compojure_api") % data)]
    (println "Generating new compojure-api project")
    (->files data
             [".gitignore"  (render "gitignore")]
             ["project.clj" (render "project.clj")]
             ["README.md"   (render "README.md")]
             ["profiles.clj" (render "profiles.clj")]
             ["src/clj/{{sanitized}}/config.clj" (render "config.clj")]
             ["src/clj/{{sanitized}}/db.clj" (render "db.clj")]
             ["src/clj/{{sanitized}}/dev.clj" (render "dev.clj")]
             ["src/clj/{{sanitized}}/handler.clj" (render "handler.clj")]
             ["src/clj/{{sanitized}}/server.clj" (render "server.clj")])))

