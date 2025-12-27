# 📍 Cordova Location Enabler App (Android)

This project is a **Cordova-based Android application** with a **custom Cordova plugin** that helps users enable device location services by opening the **system Location Settings screen**, in full compliance with Android security and privacy rules.

---

## 🚀 Project Overview

- Built using **Apache Cordova**
- Custom **Android Cordova Plugin**
- Demonstrates communication between **JavaScript and native Android code**
- Follows **Android-recommended approach** for enabling location services

---

## ❗ Important Android Security Note

> Android **does NOT allow apps to enable Location (GPS) automatically**.

Even applications like **Google Maps**, **Uber**, or **Ola** cannot directly turn ON location services.

Instead, they:
- Prompt the user
- Redirect the user to system Location Settings

✅ This project correctly follows **Android security and privacy policies**.

---

## 🧩 Features

- Cordova Android application
- Button: **Enable Location**
- Custom Cordova plugin written in **Java**
- Opens **Android Location Settings**
- Clean separation of layers:
  - UI → HTML / CSS
  - Logic → JavaScript
  - Native → Android Java

---

## 🗂 Project Structure

<img width="329" height="498" alt="image" src="https://github.com/user-attachments/assets/159245b7-edfe-4b89-bbc6-52fe7e9a7d4c" />




---

## 🔌 Custom Plugin: `cordova-plugin-locationenabler`

### Plugin Responsibility

- Acts as a bridge between **JavaScript** and **Android native layer**
- Uses Android Intent to open location settings:

```java
Settings.ACTION_LOCATION_SOURCE_SETTINGS
Redirects the user to system Location Settings

🔄 Working Flow
User clicks Enable Location

JavaScript calls cordova.exec

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
APK Output
swift
Copy code
platforms/android/app/build/outputs/apk/debug/app-debug.apk
✅ Conclusion
This implementation follows Google-recommended best practices and Android security restrictions.
Directly enabling GPS programmatically is not permitted, so opening the system Location Settings is the correct and approved approach.

👩‍💻 Developer: Nupur Vyas
📱 Platform: Android (Cordova)

