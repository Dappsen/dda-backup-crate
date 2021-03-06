(defproject org.domaindrivenarchitecture/dda-backup-crate "0.1.0-SNAPSHOT"
  :description "A crate to handle configuration, their dependencies, documentation and validation"
  :url "https://www.domaindrivenarchitecture.org"
  :license {:name "Apache License, Version 2.0"
            :url "https://www.apache.org/licenses/LICENSE-2.0.html"}
 :dependencies [[org.clojure/clojure "1.6.0"]
                [com.palletops/pallet "0.8.0-RC.11"]
                [com.palletops/pallet "0.8.0-RC.11" :classifier "tests"]
                [com.palletops/stevedore "0.8.0-beta.7"]
                [org.domaindrivenarchitecture.org/dda-config-crate "0.1.0"]]
 :profiles {:dev
            {:dependencies
             [[com.palletops/pallet "0.8.0-RC.11" :classifier "tests"]
              ]
             :plugins
             [[com.palletops/pallet-lein "0.8.0-alpha.1"]]}
             :leiningen/reply
              {:dependencies [[org.slf4j/jcl-over-slf4j "1.7.2"]]
               :exclusions [commons-logging]}}
 :local-repo-classpath true
 :repositories {"clojars" "http://clojars.org/repo/"}
 :classifiers {:tests {:source-paths ^:replace ["test"]
                       :resource-paths ^:replace []}})
 
  
