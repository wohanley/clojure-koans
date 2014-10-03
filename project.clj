(defproject clojure-koans "0.5.0-SNAPSHOT"
  :description "The Clojure koans."
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [koan-engine "0.2.3"]]
  :dev-dependencies [[lein-koan "0.1.3"]]
  :profiles {:dev {:dependencies [[lein-koan "0.1.3"]]
                   :plugins [[cider/cider-nrepl "0.8.0-SNAPSHOT"]]}}
  :repl-options {:init-ns koan-engine.runner
                 :init (do (use '[koan-engine.core]))}
  :plugins [[lein-koan "0.1.3"]]
  :main koan-engine.runner/exec)
