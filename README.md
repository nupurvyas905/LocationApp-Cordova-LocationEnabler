\# LocationApp – Cordova Location Enabler Plugin



This project is a \*\*Cordova Android application\*\* with a \*\*custom Android plugin\*\* that allows the user to enable device location (GPS) by opening the Android Location Settings screen.



---



\## 📱 Project Overview



\- Built using \*\*Apache Cordova 13\*\*

\- Includes a \*\*custom Android plugin\*\*

\- Demonstrates \*\*JavaScript → Native Android communication\*\*

\- Tested on a real Android device



---



\## ✅ Features



\- Cordova app with \*\*Enable Location\*\* button

\- Custom Cordova plugin written in:

&nbsp; - Java (Android native)

&nbsp; - JavaScript (Cordova bridge)

\- Opens Android \*\*Location Settings\*\* when button is clicked



> ⚠️ Note:  

> Due to Android security restrictions, apps \*\*cannot enable GPS programmatically\*\*.  

> The plugin correctly redirects the user to the system Location Settings screen.



---



\## 🗂 Project Structure



LocationApp/

│

├── www/

│ ├── index.html

│ ├── css/

│ └── js/

│

├── cordova-plugin-locationenabler/

│ ├── plugin.xml

│ ├── package.json

│ ├── src/android/LocationEnabler.java

│ └── www/locationEnabler.js

│

├── config.xml

├── package.json

└── README.md



yaml

Copy code



---



\## 🔌 Custom Plugin Details



\*\*Plugin Name:\*\* `cordova-plugin-locationenabler`



\### JavaScript Bridge

Uses `cordova.exec()` to communicate with native Android code.



\### Android Native Code

Uses Android `Intent` to open:

Settings.ACTION\_LOCATION\_SOURCE\_SETTINGS



yaml

Copy code



---



\## ▶️ How It Works



1\. User clicks \*\*Enable Location\*\* button

2\. JavaScript calls Cordova plugin

3\. Plugin triggers Android native code

4\. Android Location Settings screen opens

5\. User enables GPS manually



---



\## 🚀 How to Run the App



\### Prerequisites

\- Node.js

\- Cordova CLI

\- Android Studio

\- Android SDK

\- Java JDK 21

\- Gradle 8+



\### Commands



```bash

cordova platform add android

cordova plugin add ./cordova-plugin-locationenabler

cordova build android

cordova run android



🧪 Tested On

Android Device (Physical)



Android API 35+



Windows 11



👩‍💻 Author

Nupur Vyas

