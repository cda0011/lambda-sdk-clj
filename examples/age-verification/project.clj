(defproject age-verification "0.0.1-SNAPSHOT"
  :min-lein-version "2.9.0"
  :dependencies [[org.clojure/clojure "1.11.2"]
                 [org.clojure/clojurescript "1.11.132"
                  :exclusions [com.google.javascript/closure-compiler-unshaded
                               org.clojure/google-closure-library]]
                 [io.github.manetu/lambda-sdk "0.0.1-SNAPSHOT"]
                 [thheller/shadow-cljs "2.27.1"]
                 [cljstache "2.0.6"]
                 [com.andrewmcveigh/cljs-time "0.5.2"]]
  :source-paths ["src"])