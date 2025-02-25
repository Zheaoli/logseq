(ns frontend.components.svg
  (:require [rum.core :as rum]))

(rum/defc arrow-down
  []
  [:svg
   {:aria-hidden "true"
    :height      "16"
    :width       "10"
    :version     "1.1"
    :view-box    "0 0 10 16"
    :fill        "currentColor"
    :display     "inline-block"}
   [:path
    {:d         "M5 11L0 6l1.5-1.5L5 8.25 8.5 4.5 10 6l-5 5z"
     :fill-rule "evenodd"}]])

(rum/defc arrow-right-2
  []
  [:svg
   {:aria-hidden "true"
    :height      "16"
    :width       "10"
    :version     "1.1"
    :view-box    "0 0 10 16"
    :fill        "currentColor"
    :display     "inline-block"}
   [:path
    {:d         "M7.5 8l-5 5L1 11.5 4.75 8 1 4.5 2.5 3l5 5z"
     :fill-rule "evenodd"}]])

(defonce arrow-right-v2
         [:svg.h-3.w-3
          {:version  "1.1"
           :view-box "0 0 128 128"
           :fill     "currentColor"
           :display  "inline-block"
           :style    {:margin-top -3}}
          [:path
           {:d
            "M99.069 64.173c0 2.027-.77 4.054-2.316 5.6l-55.98 55.98a7.92 7.92 0 01-11.196 0c-3.085-3.086-3.092-8.105 0-11.196l50.382-50.382-50.382-50.382a7.92 7.92 0 010-11.195c3.086-3.085 8.104-3.092 11.196 0l55.98 55.98a7.892 7.892 0 012.316 5.595z"}]])

(defonce arrow-down-v2
         [:svg.h-3.w-3
          {:version  "1.1"
           :view-box "0 0 128 128"
           :fill     "currentColor"
           :display  "inline-block"
           :style    {:margin-top -3}}
          [:path
           {:d
            "M64.177 100.069a7.889 7.889 0 01-5.6-2.316l-55.98-55.98a7.92 7.92 0 010-11.196c3.086-3.085 8.105-3.092 11.196 0l50.382 50.382 50.382-50.382a7.92 7.92 0 0111.195 0c3.086 3.086 3.092 8.104 0 11.196l-55.98 55.98a7.892 7.892 0 01-5.595 2.316z"}]])

(defonce loading
         [:svg.h-5.w-5.animate-spin
          {:version  "1.1"
           :view-box "0 0 24 24"
           :fill     "none"
           :display  "inline-block"}
          [:circle.opacity-25 {:cx 12 :cy 12 :r 10 :stroke "currentColor" :stroke-width 4}]
          [:path.opacity-75 {:fill "currentColor"
                             :d    "M4 12a8 8 0 018-8V0C5.373 0 0 5.373 0 12h4zm2 5.291A7.962 7.962 0 014 12H0c0 3.042 1.135 5.824 3 7.938l3-2.647z"}]])

(defn- hero-icon
  ([d]
   (hero-icon d {}))
  ([d options]
   [:svg (merge {:fill "currentColor", :viewBox "0 0 24 24", :height "24", :width "24"}
                options)
    [:path
     {:stroke-linejoin "round"
      :stroke-linecap  "round"
      :stroke-width    "2"
      :stroke          "currentColor"
      :d               d}]]))

(def refresh
  (hero-icon "M4 4V9H4.58152M19.9381 11C19.446 7.05369 16.0796 4 12 4C8.64262 4 5.76829 6.06817 4.58152 9M4.58152 9H9M20 20V15H19.4185M19.4185 15C18.2317 17.9318 15.3574 20 12 20C7.92038 20 4.55399 16.9463 4.06189 13M19.4185 15H15"
             {:fill "none"}))

(def close (hero-icon "M6 18L18 6M6 6L18 18"))
(def folder (hero-icon "M3 7v10a2 2 0 002 2h14a2 2 0 002-2V9a2 2 0 00-2-2h-6l-2-2H5a2 2 0 00-2 2z"))
(def settings-sm [:svg {:viewBox "0 0 20 20", :fill "currentColor", :height "20", :width "20"}
                  [:path {:fill-rule "evenodd", :d "M11.49 3.17c-.38-1.56-2.6-1.56-2.98 0a1.532 1.532 0 01-2.286.948c-1.372-.836-2.942.734-2.106 2.106.54.886.061 2.042-.947 2.287-1.561.379-1.561 2.6 0 2.978a1.532 1.532 0 01.947 2.287c-.836 1.372.734 2.942 2.106 2.106a1.532 1.532 0 012.287.947c.379 1.561 2.6 1.561 2.978 0a1.533 1.533 0 012.287-.947c1.372.836 2.942-.734 2.106-2.106a1.533 1.533 0 01.947-2.287c1.561-.379 1.561-2.6 0-2.978a1.532 1.532 0 01-.947-2.287c.836-1.372-.734-2.942-2.106-2.106a1.532 1.532 0 01-2.287-.947zM10 13a3 3 0 100-6 3 3 0 000 6z", :clip-rule "evenodd"}]])
(def logout-sm [:svg {:viewBox "0 0 20 20", :fill "currentColor", :height "18", :width "18"}
                [:path {:fill-rule "evenodd", :d "M3 3a1 1 0 00-1 1v12a1 1 0 102 0V4a1 1 0 00-1-1zm10.293 9.293a1 1 0 001.414 1.414l3-3a1 1 0 000-1.414l-3-3a1 1 0 10-1.414 1.414L14.586 9H7a1 1 0 100 2h7.586l-1.293 1.293z", :clip-rule "evenodd"}]])
(def trash-sm [:svg {:viewBox "0 0 20 20", :fill "currentColor", :height "16", :width "16"}
               [:path {:fill-rule "evenodd", :d "M9 2a1 1 0 00-.894.553L7.382 4H4a1 1 0 000 2v10a2 2 0 002 2h8a2 2 0 002-2V6a1 1 0 100-2h-3.382l-.724-1.447A1 1 0 0011 2H9zM7 8a1 1 0 012 0v6a1 1 0 11-2 0V8zm5-1a1 1 0 00-1 1v6a1 1 0 102 0V8a1 1 0 00-1-1z", :clip-rule "evenodd"}]])
(def external-link
  [:svg {:fill   "none", :view-box "0 0 24 24", :height "21", :width "21"
         :stroke "currentColor"}
   [:path
    {:stroke-linejoin "round"
     :stroke-linecap  "round"
     :stroke-width    "2"
     :d               "M10 6H6a2 2 0 00-2 2v10a2 2 0 002 2h10a2 2 0 002-2v-4M14 4h6m0 0v6m0-6L10 14"}]])
(rum/defc note
  []
  [:svg.h-8.w-8.svg-shadow.note
   {:view-box "0 0 512 512"
    :fill     "currentColor"}
   [:path
    {:d
     "M256 8C119.043 8 8 119.083 8 256c0 136.997 111.043 248 248 248s248-111.003 248-248C504 119.083 392.957 8 256 8zm0 110c23.196 0 42 18.804 42 42s-18.804 42-42 42-42-18.804-42-42 18.804-42 42-42zm56 254c0 6.627-5.373 12-12 12h-88c-6.627 0-12-5.373-12-12v-24c0-6.627 5.373-12 12-12h12v-64h-12c-6.627 0-12-5.373-12-12v-24c0-6.627 5.373-12 12-12h64c6.627 0 12 5.373 12 12v100h12c6.627 0 12 5.373 12 12v24z"}]])

(rum/defc tip
  []
  [:svg.h-8.w-8.tip
   {:view-box "0 0 352 512"
    :fill     "currentColor"}
   [:path
    {:d
     "M96.06 454.35c.01 6.29 1.87 12.45 5.36 17.69l17.09 25.69a31.99 31.99 0 0 0 26.64 14.28h61.71a31.99 31.99 0 0 0 26.64-14.28l17.09-25.69a31.989 31.989 0 0 0 5.36-17.69l.04-38.35H96.01l.05 38.35zM0 176c0 44.37 16.45 84.85 43.56 115.78 16.52 18.85 42.36 58.23 52.21 91.45.04.26.07.52.11.78h160.24c.04-.26.07-.51.11-.78 9.85-33.22 35.69-72.6 52.21-91.45C335.55 260.85 352 220.37 352 176 352 78.61 272.91-.3 175.45 0 73.44.31 0 82.97 0 176zm176-80c-44.11 0-80 35.89-80 80 0 8.84-7.16 16-16 16s-16-7.16-16-16c0-61.76 50.24-112 112-112 8.84 0 16 7.16 16 16s-7.16 16-16 16z"}]])

(rum/defc important
  []
  [:svg.h-8.w-8.svg-shadow.important
   {:view-box "0 0 512 512"
    :fill     "currentColor"
    :color    "#bf0000"}
   [:path
    {:d
     "M504 256c0 136.997-111.043 248-248 248S8 392.997 8 256C8 119.083 119.043 8 256 8s248 111.083 248 248zm-248 50c-25.405 0-46 20.595-46 46s20.595 46 46 46 46-20.595 46-46-20.595-46-46-46zm-43.673-165.346l7.418 136c.347 6.364 5.609 11.346 11.982 11.346h48.546c6.373 0 11.635-4.982 11.982-11.346l7.418-136c.375-6.874-5.098-12.654-11.982-12.654h-63.383c-6.884 0-12.356 5.78-11.981 12.654z"}]])

(rum/defc caution
  []
  [:svg.h-8.w-8.svg-shadow.caution
   {:view-box "0 0 384 512"
    :fill     "currentColor"
    :color    "#bf3400"}
   [:path
    {:d
     "M216 23.86c0-23.8-30.65-32.77-44.15-13.04C48 191.85 224 200 224 288c0 35.63-29.11 64.46-64.85 63.99-35.17-.45-63.15-29.77-63.15-64.94v-85.51c0-21.7-26.47-32.23-41.43-16.5C27.8 213.16 0 261.33 0 320c0 105.87 86.13 192 192 192s192-86.13 192-192c0-170.29-168-193-168-296.14z"}]])

(defn warning
  ([]
   (warning nil))
  ([opts]
   [:svg.h-8.w-8.svg-shadow.warning
    (merge
      {:view-box "0 0 576 512"
       :fill     "currentColor"
       :color    "#bf6900"}
      opts)
    [:path
     {:d
      "M569.517 440.013C587.975 472.007 564.806 512 527.94 512H48.054c-36.937 0-59.999-40.055-41.577-71.987L246.423 23.985c18.467-32.009 64.72-31.951 83.154 0l239.94 416.028zM288 354c-25.405 0-46 20.595-46 46s20.595 46 46 46 46-20.595 46-46-20.595-46-46-46zm-43.673-165.346l7.418 136c.347 6.364 5.609 11.346 11.982 11.346h48.546c6.373 0 11.635-4.982 11.982-11.346l7.418-136c.375-6.874-5.098-12.654-11.982-12.654h-63.383c-6.884 0-12.356 5.78-11.981 12.654z"}]]))

(rum/defc pinned
  []
  [:svg.h-8.w-8.pinned
   {:view-box "0 0 352 512"
    :fill     "currentColor"}
   [:path
    {:d
     "M322.397,252.352l75.068-75.067c19.346,5.06,40.078,3.441,58.536-4.873L339.589,56c-8.313,18.458-9.933,39.189-4.873,58.536
        l-75.066,75.067c-35.168-16.745-76.173-17.14-111.618-1.176l65.009,65.01L55.999,456l202.563-157.041l65.01,65.01
        C339.535,328.526,339.142,287.519,322.397,252.352z M201.513,216.553c0,0-16.568-16.568-21.323-21.035
        c37.027-10.806,61.375,4.323,61.375,4.323C218.946,192.781,201.513,216.553,201.513,216.553z"}]])


(rum/defc caret-up
  []
  [:svg.h-4.w-4
   {:aria-hidden "true"
    :version     "1.1"
    :view-box    "0 0 320 512"
    :fill        "currentColor"
    :display     "inline-block"}
   [:path {:d "M288.662 352H31.338c-17.818 0-26.741-21.543-14.142-34.142l128.662-128.662c7.81-7.81 20.474-7.81 28.284 0l128.662 128.662c12.6 12.599 3.676 34.142-14.142 34.142z"}]])


(rum/defc caret-down
  []
  [:svg.h-4.w-4
   {:aria-hidden "true"
    :version     "1.1"
    :view-box    "0 0 192 512"
    :fill        "currentColor"
    :display     "inline-block"}
   [:path
    {:d         "M31.3 192h257.3c17.8 0 26.7 21.5 14.1 34.1L174.1 354.8c-7.8 7.8-20.5 7.8-28.3 0L17.2 226.1C4.6 213.5 13.5 192 31.3 192z"
     :fill-rule "evenodd"}]])

(rum/defc caret-right
  []
  [:svg.h-4.w-4
   {:aria-hidden "true"
    :version     "1.1"
    :view-box    "0 0 192 512"
    :fill        "currentColor"
    :display     "inline-block"
    :style       {:margin-left 2}}
   [:path
    {:d         "M0 384.662V127.338c0-17.818 21.543-26.741 34.142-14.142l128.662 128.662c7.81 7.81 7.81 20.474 0 28.284L34.142 398.804C21.543 411.404 0 402.48 0 384.662z"
     :fill-rule "evenodd"}]])

(rum/defc logo
  [_dark?]
  [:svg
   {:fill "currentColor", :view-box "0 0 21 21", :height "21", :width "21"}
   [:ellipse
    {:transform
         "matrix(0.987073 0.160274 -0.239143 0.970984 11.7346 2.59206)"
     :ry "2.04373"
     :rx "3.29236"}]
   [:ellipse
    {:transform
         "matrix(-0.495846 0.868411 -0.825718 -0.564084 3.97209 5.54515)"
     :ry "3.37606"
     :rx "2.95326"}]
   [:ellipse
    {:transform
         "matrix(0.987073 0.160274 -0.239143 0.970984 13.0843 14.72)"
     :ry "6.13006"
     :rx "7.78547"}]])

(def page
  [:svg.h-5.w-4 {:viewBox "0 0 24 24", :fill "none", :xmlns "http://www.w3.org/2000/svg"}
   [:path {:d "M2 0.5H6.78272L13.5 7.69708V18C13.5 18.8284 12.8284 19.5 12 19.5H2C1.17157 19.5 0.5 18.8284 0.5 18V2C0.5 1.17157 1.17157 0.5 2 0.5Z", :fill "var(--ls-active-primary-color)"}]
   [:path {:d "M7 5.5V0L14 7.5H9C7.89543 7.5 7 6.60457 7 5.5Z", :fill "var(--ls-active-secondary-color)"}]])

(def clock
  [:svg.h-5.w-5
   {:fill "currentColor", :viewBox "0 0 20 20"}
   [:path
    {:clip-rule "evenodd",
     :d
     "M10 18a8 8 0 100-16 8 8 0 000 16zm1-12a1 1 0 10-2 0v4a1 1 0 00.293.707l2.828 2.829a1 1 0 101.415-1.415L11 9.586V6z",
     :fill-rule "evenodd"}]])

(def search
  [:svg.h-5.w-5
   {:view-box "0 0 20 20", :fill "currentColor"}
   [:path
    {:d
                "M8 4a4 4 0 100 8 4 4 0 000-8zM2 8a6 6 0 1110.89 3.476l4.817 4.817a1 1 0 01-1.414 1.414l-4.816-4.816A6 6 0 012 8z"
     :clip-rule "evenodd"
     :fill-rule "evenodd"}]])

(def edit
  [:svg.h-6.w-6
   {:stroke "currentColor", :view-box "0 0 24 24", :fill "none"}
   [:path
    {:d
                      "M15.232 5.232l3.536 3.536m-2.036-5.036a2.5 2.5 0 113.536 3.536L6.5 21.036H3v-3.572L16.732 3.732z",
     :stroke-width    "2",
     :stroke-linejoin "round",
     :stroke-linecap  "round"}]])


(defn github
  ([] (github nil))
  ([opts]
   [:svg.icon
    (merge {:stroke  "currentColor"
            :fill    "currentColor"
            :viewBox "0 0 1024 1024"
            :width   "20"
            :height  "20"} opts)
    [:path {:d "M512 12.63616c-282.74688 0-512 229.21216-512 512 0 226.22208 146.69824 418.14016 350.12608 485.82656 25.57952 4.73088 35.00032-11.10016 35.00032-24.63744 0-12.20608-0.47104-52.55168-0.69632-95.31392-142.4384 30.96576-172.50304-60.416-172.50304-60.416-23.28576-59.16672-56.85248-74.91584-56.85248-74.91584-46.44864-31.78496 3.50208-31.1296 3.50208-31.1296 51.4048 3.60448 78.47936 52.75648 78.47936 52.75648 45.6704 78.27456 119.76704 55.64416 149.01248 42.55744 4.58752-33.09568 17.85856-55.68512 32.50176-68.46464-113.72544-12.94336-233.2672-56.85248-233.2672-253.0304 0-55.88992 20.00896-101.5808 52.75648-137.4208-5.3248-12.9024-22.85568-64.96256 4.95616-135.49568 0 0 43.008-13.74208 140.84096 52.49024 40.83712-11.34592 84.64384-17.03936 128.16384-17.24416 43.49952 0.2048 87.32672 5.87776 128.24576 17.24416 97.73056-66.2528 140.65664-52.49024 140.65664-52.49024 27.87328 70.53312 10.3424 122.59328 5.03808 135.49568 32.82944 35.86048 52.69504 81.53088 52.69504 137.4208 0 196.64896-119.78752 239.94368-233.79968 252.6208 18.37056 15.89248 34.73408 47.04256 34.73408 94.80192 0 68.5056-0.59392 123.63776-0.59392 140.51328 0 13.6192 9.216 29.5936 35.16416 24.576 203.32544-67.76832 349.83936-259.62496 349.83936-485.76512 0-282.78784-229.23264-512-512-512z"}]]))

(defn info []
  [:svg {:class "info" :view-box "0 0 16 16" :width "16px" :height "16px"}
   [:g [:path {:style {:transform "scale(0.25)"} :d "m32 2c-16.568 0-30 13.432-30 30s13.432 30 30 30 30-13.432 30-30-13.432-30-30-30m5 49.75h-10v-24h10v24m-5-29.5c-2.761 0-5-2.238-5-5s2.239-5 5-5c2.762 0 5 2.238 5 5s-2.238 5-5 5"}]]])

(defn play []
  [:svg
   {:stroke                "currentColor"
    :view-box              "0 0 24 24"
    :preserve-aspect-ratio "none"
    :fill                  "none"}
   [:path
    {:d
                      "M14.752 11.168l-3.197-2.132A1 1 0 0010 9.87v4.263a1 1 0 001.555.832l3.197-2.132a1 1 0 000-1.664z"
     :stroke-width    "2"
     :stroke-linejoin "round"
     :stroke-linecap  "round"}]
   [:path
    {:d               "M21 12a9 9 0 11-18 0 9 9 0 0118 0z"
     :stroke-width    "2"
     :stroke-linejoin "round"
     :stroke-linecap  "round"}]])

(defn zoom-in
  ([] (zoom-in 16))
  ([size]
   [:svg {:xmlns "http://www.w3.org/2000/svg" :width size :height size :fill "none" :viewBox "0 0 24 24" :stroke "currentColor"}
    [:path {:stroke-linecap "round" :stroke-linejoin "round" :stroke-width "2" :d "M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0zM10 7v3m0 0v3m0-3h3m-3 0H7"}]]))

(defn zoom-out
  ([] (zoom-out 16))
  ([size]
   [:svg {:fill "none" :width size :height size :viewBox "0 0 24 24" :stroke "currentColor"}
    [:path {:stroke-linecap "round" :stroke-linejoin "round" :stroke-width "2" :d "M21 21l-6-6m2-5a7 7 0 11-14 0 7 7 0 0114 0zM13 10H7"}]]))

(defn icon-area
  ([] icon-area 16)
  ([size]
   [:svg {:viewBox "0 0 1024 1024" :version "1.1" :width size :height size :stroke "currentColor"}
    [:path {:d "M844.992 115.008H179.008c-35.328 0-64 28.672-64 64v665.984c0 35.328 28.672 64 64 64h665.984c35.328 0 64-28.672 64-64V179.008c0-35.328-28.672-64-64-64zM364.672 844.992H217.6L844.992 217.6v147.072l-480.32 480.32z m480.32-401.152v147.2l-254.016 253.952H443.84l401.152-401.152z m-187.648-264.832h147.072l-625.408 625.408V657.28l478.336-478.336zM179.008 578.112V431.04l252.032-252.032h147.136L179.008 578.112z m172.864-399.104l-172.864 172.8v-172.8h172.864z m318.272 665.984l174.848-174.848v174.848h-174.848z" :fill "currentColor"}]]))

(defn icon-info
  ([] (icon-info 16))
  ([size]
   [:svg {:viewBox "0 0 1024 1024" :width size :height size :stroke "currentColor"}
    [:path {:d "M512 981.333333C253.866667 981.333333 42.666667 770.133333 42.666667 512S253.866667 42.666667 512 42.666667s469.333333 211.2 469.333333 469.333333-211.2 469.333333-469.333333 469.333333z m0-844.8c-206.506667 0-375.466667 168.96-375.466667 375.466667 0 206.506667 168.96 375.466667 375.466667 375.466667 206.506667 0 375.466667-168.96 375.466667-375.466667 0-206.506667-168.96-375.466667-375.466667-375.466667z" :fill "currentColor"}]
    [:path {:d "M512 796.714667a46.08 46.08 0 0 1-46.933333-46.933334v-269.056c0-26.624 20.352-46.933333 46.933333-46.933333 26.581333 0 46.933333 20.309333 46.933333 46.933333v269.056c0 26.624-20.352 46.933333-46.933333 46.933334zM512 364.928a46.08 46.08 0 0 1-46.933333-46.933333V274.218667c0-26.624 20.352-46.933333 46.933333-46.933334 26.581333 0 46.933333 20.309333 46.933333 46.933334v43.776c0 26.624-21.888 46.933333-46.933333 46.933333z" :fill "currentColor"}]]))

(defn view-list
  ([] (view-list 16))
  ([size]
   [:svg.icon {:viewBox "0 0 1024 1024" :width size :height size :fill "none" :stroke "currentColor"}
    [:path {:d "M134.976 853.312H89.6c-26.56 0-46.912-20.928-46.912-48.256 0-27.392 20.352-48.32 46.912-48.32h45.376c26.624 0 46.912 20.928 46.912 48.32 0 27.328-20.288 48.256-46.912 48.256zM134.976 560.32H89.6C63.04 560.32 42.688 539.392 42.688 512s20.352-48.32 46.912-48.32h45.376c26.624 0 46.912 20.928 46.912 48.32s-20.288 48.32-46.912 48.32zM134.976 267.264H89.6c-26.56 0-46.912-20.928-46.912-48.32 0-27.328 20.352-48.256 46.912-48.256h45.376c26.624 0 46.912 20.928 46.912 48.256 0 27.392-20.288 48.32-46.912 48.32zM311.744 853.312c-26.56 0-46.912-20.928-46.912-48.256 0-27.392 20.352-48.32 46.912-48.32h622.72c26.56 0 46.848 20.928 46.848 48.32 0 27.328-20.288 48.256-46.912 48.256H311.744c1.6 0 1.6 0 0 0zM311.744 560.32c-26.56 0-46.912-20.928-46.912-48.32s20.352-48.32 46.912-48.32h622.72c26.56 0 46.848 20.928 46.848 48.32s-20.288 48.32-46.912 48.32H311.744c1.6 0 1.6 0 0 0zM311.744 267.264c-26.56 0-46.912-20.928-46.912-48.32 0-27.328 20.352-48.256 46.912-48.256h622.72c26.56 0 46.848 20.928 46.848 48.256 0 27.392-20.288 48.32-46.912 48.32H311.744c1.6 0 1.6 0 0 0z" :fill "currentColor"}]]))

(defn highlighter
  ([] (highlighter 16))
  ([size]
   [:svg
    {:stroke "currentColor", :view-box "0 0 24 24", :fill "none" :width size :height size}
    [:path
     {:d
      "M15.232 5.232l3.536 3.536m-2.036-5.036a2.5 2.5 0 113.536 3.536L6.5 21.036H3v-3.572L16.732 3.732z"
      :stroke-width    "2"
      :stroke-linejoin "round"
      :stroke-linecap  "round"}]]))

(defn adjustments
  ([] (adjustments 16))
  ([size]
   [:svg.icon {:fill "none" :width size :height size :viewBox "0 0 24 24" :stroke "currentColor"}
    [:path {:stroke-linecap "round" :stroke-linejoin "round" :stroke-width "2" :d "M12 6V4m0 2a2 2 0 100 4m0-4a2 2 0 110 4m-6 8a2 2 0 100-4m0 4a2 2 0 110-4m0 4v2m0-6V4m6 6v10m6-2a2 2 0 100-4m0 4a2 2 0 110-4m0 4v2m0-6V4"}]]))

(defn check
  ([] (check 16))
  ([size]
   [:svg.icon {:fill "none" :width size :height size :viewBox "0 0 24 24" :stroke "currentColor"}
    [:path {:stroke-linecap "round" :stroke-linejoin "round" :stroke-width "2" :d "M5 13l4 4L19 7"}]]))

(defn cloud-down
  ([] (cloud-down 16))
  ([size]
   [:svg.icon {:width size :height size :viewBox "0 0 24 24" :stroke-width "2" :stroke "currentColor" :fill "none" :stroke-linecap "round" :stroke-linejoin "round"}
    [:path {:stroke "none" :d "M0 0h24v24H0z" :fill "none"}]
    [:path {:d "M19 18a3.5 3.5 0 0 0 0 -7h-1a5 4.5 0 0 0 -11 -2a4.6 4.4 0 0 0 -2.1 8.4"}]
    [:line {:x1 "12" :y1 "13" :x2 "12" :y2 "22"}]
    [:polyline {:points "9 19 12 22 15 19"}]]))

(defn star
  ([] (star 16))
  ([size]
   [:svg.icon {:width size :height size :viewBox "0 0 24 24" :stroke-width "2" :stroke "currentColor" :fill "none" :stroke-linecap "round" :stroke-linejoin "round"}
    [:path {:stroke "none" :d "M0 0h24v24H0z" :fill "none"}]
    [:path {:d "M12 17.75l-6.172 3.245l1.179 -6.873l-5 -4.867l6.9 -1l3.086 -6.253l3.086 6.253l6.9 1l-5 4.867l1.179 6.873z"}]]))

(defn apps
  ([] (apps 16))
  ([size]
   [:svg.icon-apps {:width size :height size :viewBox "0 0 24 24" :stroke-width "2" :stroke "currentColor" :fill "none" :stroke-linecap "round" :stroke-linejoin "round"}
    [:path {:stroke "none" :d "M0 0h24v24H0z" :fill "none"}]
    [:rect {:x "4" :y "4" :width "6" :height "6" :rx "1"}]
    [:rect {:x "4" :y "14" :width "6" :height "6" :rx "1"}]
    [:rect {:x "14" :y "14" :width "6" :height "6" :rx "1"}]
    [:line {:x1 "14" :y1 "7" :x2 "20" :y2 "7"}]
    [:line {:x1 "17" :y1 "4" :x2 "17" :y2 "10"}]]))

(defn reload
  ([] (reload 16))
  ([size]
   [:svg.icon-reload {:width size :height size :viewBox "0 0 24 24" :stroke-width "2" :stroke "currentColor" :fill "none" :stroke-linecap "round" :stroke-linejoin "round"}
    [:path {:stroke "none" :d "M0 0h24v24H0z" :fill "none"}]
    [:path {:d "M4.05 11a8 8 0 1 1 .5 4m-.5 5v-5h5"}]]))

(defn offline
  ([] (offline 16))
  ([size]
   [:svg.icon-offline {:viewBox "0 0 1024 1024" :width size :height size}
    [:path {:d "M512 183.466667c149.333333 0 292.266667 46.933333 409.6 132.266666 19.2 12.8 23.466667 40.533333 8.533333 59.733334-12.8 19.2-40.533333 23.466667-59.733333 8.533333-102.4-74.666667-228.266667-115.2-358.4-115.2-130.133333 0-256 40.533333-358.4 115.2-19.2 12.8-44.8 8.533333-59.733333-8.533333-12.8-19.2-8.533333-44.8 8.533333-59.733334 119.466667-85.333333 260.266667-132.266667 409.6-132.266666z m0 170.666666c108.8 0 211.2 32 298.666667 91.733334 19.2 12.8 23.466667 40.533333 10.666666 59.733333-12.8 19.2-40.533333 23.466667-59.733333 10.666667-72.533333-51.2-160-78.933333-251.733333-78.933334-91.733333 0-177.066667 27.733333-249.6 76.8-19.2 12.8-44.8 8.533333-59.733334-10.666666-12.8-19.2-8.533333-44.8 10.666667-59.733334 89.6-57.6 192-89.6 300.8-89.6z m0 168.533334c23.466667 0 42.666667 19.2 42.666667 42.666666s-19.2 42.666667-42.666667 42.666667c-51.2 0-100.266667 14.933333-142.933333 40.533333-19.2 12.8-46.933333 6.4-57.6-14.933333-12.8-19.2-6.4-46.933333 14.933333-57.6 53.333333-34.133333 117.333333-53.333333 185.6-53.333333z m0 189.866666c34.133333 0 64 27.733333 64 64 0 34.133333-27.733333 64-64 64s-64-27.733333-64-64c0-34.133333 27.733333-64 64-64z m164.266667-106.666666l89.6 89.6 89.6-89.6c17.066667-17.066667 42.666667-17.066667 59.733333 0 17.066667 17.066667 17.066667 42.666667 0 59.733333l-89.6 89.6 89.6 89.6c17.066667 17.066667 17.066667 42.666667 0 59.733333-17.066667 17.066667-42.666667 17.066667-59.733333 0l-89.6-89.6-89.6 89.6c-17.066667 17.066667-42.666667 17.066667-59.733334 0-17.066667-17.066667-17.066667-42.666667 0-59.733333l89.6-89.6-89.6-89.6c-17.066667-17.066667-17.066667-42.666667 0-59.733333 14.933333-17.066667 42.666667-17.066667 59.733334 0z" :fill "currentColor"}]]))

(defn annotations
  ([] (annotations 16))
  ([size]
   [:svg.icon {:viewBox "0 0 1024 1024" :width size :height size}
    [:path {:d "M866.368 64 157.632 64C105.984 64 64 105.984 64 157.632l0 522.112c0 51.648 41.984 93.632 93.632 93.632l111.744 0 132.736 174.08C408.192 955.392 417.536 960 427.584 960s19.392-4.608 25.408-12.544l132.736-174.08 280.64 0c51.648 0 93.632-41.984 93.632-93.632L960 157.632C960 105.984 918.016 64 866.368 64zM429.504 234.624 318.72 599.808C313.408 617.536 295.36 627.52 278.528 622.4 261.632 617.344 252.16 598.848 257.472 581.376l110.72-365.312c5.312-17.472 23.36-27.584 40.32-22.464C425.408 198.72 434.816 217.216 429.504 234.624zM827.2 391.04c-3.2 5.504-6.656 9.088-10.176 10.624-33.152 12.992-69.632 22.592-109.376 28.48 7.232 6.592 16.064 15.488 26.624 26.496 10.496 11.136 16.064 17.024 16.512 17.728 3.904 5.376 9.28 12.032 16.192 19.968 6.912 8 11.776 14.208 14.464 18.688 2.688 4.544 4.032 9.92 4.032 16.384 0 8.192-3.072 15.424-9.28 21.568-6.144 6.208-14.144 9.28-23.872 9.28S731.648 552.704 719.36 537.6c-12.16-15.104-27.968-42.368-47.168-81.664C652.672 491.328 639.552 514.752 632.96 526.08 626.24 537.28 619.84 545.792 613.696 551.616c-6.208 5.76-13.184 8.704-21.184 8.704-9.472 0-17.408-3.264-23.744-9.792C562.56 543.936 559.36 536.896 559.36 529.472c0-6.912 1.28-12.16 3.84-15.744 23.616-32.064 48.256-60.032 73.984-83.584C615.616 426.816 596.352 423.04 579.456 419.008 562.496 414.784 544.448 408.896 525.504 400.896c-3.136-1.536-6.144-5.12-9.088-10.624C513.408 384.832 512 379.712 512 375.04c0-8.96 3.264-16.512 9.792-22.528 6.592-6.144 14.08-9.088 22.592-9.088 6.208 0 13.824 1.856 23.104 5.568 9.216 3.776 20.928 9.152 35.2 16.192s30.528 14.912 48.768 23.68c-3.392-16.192-6.144-34.752-8.32-55.616-2.176-20.928-3.264-35.264-3.264-43.008 0-9.472 3.008-17.536 9.024-24.448 6.144-6.784 13.824-10.176 23.296-10.176 9.344 0 16.896 3.392 22.912 10.176 6.08 6.848 9.088 15.872 9.088 27.2 0 3.072-0.512 9.152-1.344 18.304-0.832 9.152-2.176 20.096-3.84 33.088-1.664 12.992-3.584 27.904-5.568 44.48 16.576-7.68 32.64-15.424 47.744-23.04 15.104-7.744 27.264-13.44 36.16-17.024 8.96-3.52 16.128-5.376 21.568-5.376 8.96 0 16.704 2.944 23.232 9.088C828.736 358.592 832 366.144 832 375.04 832 380.16 830.4 385.536 827.2 391.04z" :fill "currentColor"}]]))

(defn up-narrow
  ([] (up-narrow 16))
  ([size]
   [:svg.icon {:width size :height size :viewBox "0 0 24 24" :stroke-width "2" :stroke "currentColor" :fill "none" :stroke-linecap "round" :stroke-linejoin "round"}
    [:path {:stroke "none" :d "M0 0h24v24H0z" :fill "none"}]
    [:line {:x1 "12" :y1 "5" :x2 "12" :y2 "19"}]
    [:line {:x1 "16" :y1 "9" :x2 "12" :y2 "5"}]
    [:line {:x1 "8" :y1 "9" :x2 "12" :y2 "5"}]]))

(defn down-narrow
  ([] (down-narrow 16))
  ([size]
   [:svg.icon {:width size :height size :viewBox "0 0 24 24" :stroke-width "2" :stroke "currentColor" :fill "none" :stroke-linecap "round" :stroke-linejoin "round"}
    [:path {:stroke "none" :d "M0 0h24v24H0z" :fill "none"}]
    [:line {:x1 "12" :y1 "5" :x2 "12" :y2 "19"}]
    [:line {:x1 "16" :y1 "15" :x2 "12" :y2 "19"}]
    [:line {:x1 "8" :y1 "15" :x2 "12" :y2 "19"}]]))

(defn maximize
  ([] (maximize 16))
  ([size]
   [:svg.icon {:width size :height size :viewBox "0 0 24 24" :stroke-width "2" :stroke "currentColor" :fill "none" :stroke-linecap "round" :stroke-linejoin "round"}
    [:path {:stroke "none" :d "M0 0h24v24H0z" :fill "none"}]
    [:path {:d "M4 8v-2a2 2 0 0 1 2 -2h2"}]
    [:path {:d "M4 16v2a2 2 0 0 0 2 2h2"}]
    [:path {:d "M16 4h2a2 2 0 0 1 2 2v2"}]
    [:path {:d "M16 20h2a2 2 0 0 0 2 -2v-2"}]]))

(defn help-circle
  ([] (help-circle 16))
  ([size]
   [:svg.icon {:width size :height size :viewBox "0 0 24 24" :stroke-width "2" :stroke "currentColor" :fill "none" :stroke-linecap "round" :stroke-linejoin "round"}
    [:path {:stroke "none" :d "M0 0h24v24H0z" :fill "none"}]
    [:circle {:cx "12" :cy "12" :r "9"}]
    [:line {:x1 "12" :y1 "17" :x2 "12" :y2 "17.01"}]
    [:path {:d "M12 13.5a1.5 1.5 0 0 1 1 -1.5a2.6 2.6 0 1 0 -3 -4"}]]))
