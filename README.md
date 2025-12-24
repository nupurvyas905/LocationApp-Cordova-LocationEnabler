# LocationApp – Cordova Location Enabler Plugin

This project is a **Cordova Android application** with a **custom Android plugin** that allows the user to enable device location (GPS) by opening the Android Location Settings screen.

---

## 📱 Project Overview

- Built using **Apache Cordova 13**
- Includes a **custom Android plugin**
- Demonstrates **JavaScript → Native Android communication**
- Tested on a real Android device

---

## ✅ Features

- Cordova app with **Enable Location** button
- Custom Cordova plugin written in:
  - Java (Android native)
  - JavaScript (Cordova bridge)
- Opens Android **Location Settings** when button is clicked

> ⚠️ Note:  
> Due to Android security restrictions, apps **cannot enable GPS programmatically**.  
> The plugin correctly redirects the user to the system Location Settings screen.

---

## 🗂 Project Structure

<img width="342" height="400" alt="image" src="https://github.com/user-attachments/assets/dd85d378-8495-4bb1-92b0-6416922db25f" />




---

## 🔌 Custom Plugin Details

**Plugin Name:** `cordova-plugin-locationenabler`

### JavaScript Bridge
Uses `cordova.exec()` to communicate with native Android code.

### Android Native Code
Uses Android `Intent` to open:
Settings.ACTION_LOCATION_SOURCE_SETTINGS


---

## ▶️ How It Works

1. User clicks **Enable Location** button
2. JavaScript calls Cordova plugin
3. Plugin triggers Android native code
4. Android Location Settings screen opens
5. User enables GPS manually

---

## 🚀 How to Run the App

### Prerequisites
- Node.js
- Cordova CLI
- Android Studio
- Android SDK
- Java JDK 21
- Gradle 8+

### Commands

```bash
cordova platform add android
cordova plugin add ./cordova-plugin-locationenabler
cordova build android
cordova run android

