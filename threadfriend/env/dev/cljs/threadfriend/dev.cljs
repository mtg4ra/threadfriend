(ns ^:figwheel-no-load threadfriend.dev
  (:require
    [threadfriend.core :as core]
    [devtools.core :as devtools]))

(devtools/install!)

(enable-console-print!)

(core/init!)
