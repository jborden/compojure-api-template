(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :dependencies [[aleph "0.4.6"]
                 [org.clojure/clojure "1.11.1"]
                 [org.clojure/data.json "2.4.0"]
                 [compojure "1.7.0"]
                 [environ "1.2.0"]
                 [hikari-cp "2.13.0"]
                 [honeysql "1.0.461"]
                 [nilenso/honeysql-postgres "0.2.6"]
                 [org.clojure/java.jdbc "0.7.11"]
                 [org.postgresql/postgresql "42.2.18"]
                 [postgre-types "0.0.4"]
                 [ring/ring-core "1.6.2"]
                 [ring/ring-json "0.4.0"]
                 [ring/ring-defaults "0.3.2"]]
  :repl-options {:init-ns {{name}}.dev
                 :init    (dev-init)}
  :profiles {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                                  [ring/ring-mock "0.3.1"]]}})
