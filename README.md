\# 📍 Cordova Location Enabler App (Android)



This project is a \*\*Cordova-based Android application\*\* with a \*\*custom Cordova plugin\*\* that helps users enable device location services by opening the \*\*system Location Settings screen\*\*, in compliance with Android security rules.



---



\## 🚀 Project Overview



\- Built using \*\*Apache Cordova\*\*

\- Custom \*\*Android Cordova Plugin\*\*

\- Demonstrates communication between \*\*JavaScript and native Android code\*\*

\- Follows \*\*Android-recommended approach\*\* for enabling location services



---



\## ❗ Important Android Security Note



> Android does \*\*not allow apps to enable Location (GPS) automatically\*\*.



Even apps like \*\*Google Maps\*\* or \*\*Uber\*\* cannot directly turn ON location.  

They \*\*prompt the user\*\* or \*\*redirect to system settings\*\*.



✔ This project correctly follows Android privacy and security policies.



---



\## 🧩 Features



\- Cordova Android app

\- Button: \*\*Enable Location\*\*

\- Custom plugin written in \*\*Java\*\*

\- Opens \*\*Android Location Settings\*\*

\- Clean separation of:

&nbsp; - UI (HTML / CSS)

&nbsp; - Logic (JavaScript)

&nbsp; - Native code (Android Java)



---



\## 🗂 Project Structure



LocationApp/

│

├── www/

│ ├── index.html

│ ├── css/

│ └── js/

│ └── app.js

│

├── cordova-plugin-locationenabler/

│ ├── plugin.xml

│ ├── package.json

│ ├── www/

│ │ └── locationEnabler.js

│ └── src/

│ └── android/

│ └── LocationEnabler.java

│

├── config.xml

├── package.json

└── package-lock.json





---



\## 🔌 Custom Plugin: `cordova-plugin-locationenabler`



\### Plugin Responsibility

\- Acts as a bridge between \*\*JavaScript\*\* and \*\*Android native layer\*\*

\- Uses Android Intent:

&nbsp; ```java

&nbsp; Settings.ACTION\_LOCATION\_SOURCE\_SETTINGS

Redirects the user to system Location Settings



🧪 Working Flow

User clicks Enable Location



JavaScript calls Cordova exec



Cordova invokes native Android plugin



Plugin opens Location Settings



User enables GPS manually



▶️ How to Run the Project

Prerequisites

Node.js



Java JDK 21



Android SDK



Gradle



Apache Cordova CLI



Commands

bash

Copy code

cordova platform add android

cordova plugin add ./cordova-plugin-locationenabler

cordova build android

cordova run android

APK Output:



platforms/android/app/build/outputs/apk/debug/app-debug.apk

