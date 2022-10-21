{:dev {:env          {:environment "dev"
                      :hostname    "localhost"
                      :http-port   "3000"
                      :db-host     "localhost"
                      :db-name     "{{name}}"
                      :db-port     "5432"
                      :db-user     "postgres"
                      :db-password "postgres"}
       :source-paths ["src/clj" "test/clj"]
       :plugins      [[lein-environ "1.2.0"]]}
 }
