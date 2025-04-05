# Kotlin Multiplatform Mobile

A modern KMP application built with Clean Architecture, Compose, and platform-specific UI for Android and iOS.

---

## ✨ Features

- Kotlin Multiplatform Shared Logic
- Android UI with Jetpack Compose
- iOS UI with SwiftUI
- Compose Material3 design system
- Clean Architecture: `domain`, `data`, `presentation` layers
- Dependency Injection ready (Koin / Hilt)
- Ktor for API client
- Serialization via `kotlinx.serialization`
- Coroutine support with native `StateFlow` via [kmp-nativecoroutines](https://github.com/rickclephas/KMP-NativeCoroutines)

---

## 📁 Project Structure

```text
kotlin_multiplatform/
├── shared/             # Shared business logic
│   ├── core/           # Utility classes
│   ├── domain/         # Model & UseCases
│   ├── data/           # API, DTOs, Mappers, RepositoryImpl
│   ├── presentation/   # Shared ViewModels (optional)
│   └── di/             # Shared DI helpers
├── androidApp/         # Android UI with Jetpack Compose
└── iosApp/             # iOS UI with SwiftUI
```
---

## 🛠️ Tech Stack

| Layer            | Android                         | iOS                          |
|------------------|----------------------------------|-------------------------------|
| UI               | Jetpack Compose (Material3)     | SwiftUI                      |
| Architecture     | Clean Architecture (MVI-ready)  | Native Swift MVVM            |
| Networking       | [Ktor](https://ktor.io/)        | Shared via KMP               |
| Serialization    | [kotlinx.serialization](https://github.com/Kotlin/kotlinx.serialization) |
| Async            | Kotlin Coroutines / StateFlow   | Swift Concurrency (Task, async/await) / @Published    |
| Dependency Mgmt  | Gradle + Version Catalog (TOML) | CocoaPods                    |

---

## 🚀 Getting Started

### ✅ Prerequisites

- [Android Studio Giraffe+](https://developer.android.com/studio)
- Xcode 15+
- Kotlin 2.0.10
- JDK 17+

### 🧪 Run the app

#### Android

```bash
./gradlew :androidApp:installDebug
```

#### iOS

```bash
cd iosApp
pod install
open iosApp.xcworkspace
```
Then build and run via Xcode..

---

## 🧩 Modules
- `shared`: Core business logic shared between Android & iOS
- `androidApp`: Jetpack Compose UI
- `iosApp`: SwiftUI

## 💡 Inspiration
This project was inspired by:  
[DroidKaigi 2024 KMP structure](https://github.com/DroidKaigi/conference-app-2024)  
[touchlab/KaMPKit](https://github.com/touchlab/KaMPKit)  
[rickclephas/KMP-NativeCoroutines](https://github.com/rickclephas/KMP-NativeCoroutines)
