# Android App Template

A modern Android application template using the latest technologies:
- Kotlin 2.1.20
- Compose BOM 2025.04.01
- Material 3
- Hilt for dependency injection
- Retrofit & Moshi for networking
- Room for local storage
- DataStore for preferences
- Coroutines for async
- Coil for image loading
- Gradle Version Catalogs for dependency management

## Getting Started

### Prerequisites
- Android Studio Flamingo or later (with Android Gradle Plugin 8.8+)
- JDK 17
- Android SDK 36 (or later)

### Setup
1. Clone this template
2. Update the `applicationId` in `app/build.gradle.kts` if needed
3. Update the package name in `AndroidManifest.java` and all Kotlin files
4. Run `./gradlew wrapper` to update the Gradle wrapper (if needed)
5. Build and run the app

### Project Structure
```
app/
├── src/
│   ├── main/
│   │   ├── java/com/example/app/
│   │   │   ├── App.kt                  # Application class with Hilt
│   │   │   └── ui/
│   │   │       ├── MainActivity.kt     # Entry point
│   │   │       ├── theme/              # Material 3 theme
│   │   │       │   ├── Color.kt        # Color schemes
│   │   │       │   ├── Type.kt         # Typography
│   │   │       │   └── Theme.kt        # Theme composable
│   │   │       └── ...                 # Add your screens, ViewModels, etc.
│   │   ├── res/
│   │   │   ├── layout/                 # XML layouts (if needed)
│   │   │   ├── values/                 # Strings, colors, themes
│   │   │   ├── mipmap/                 # App icons
│   │   │   └── ...
│   │   └── AndroidManifest.xml
│   └── test/                           # Unit tests
│   └── androidTest/                    # Instrumented tests
├── build.gradle.kts                    # App module build configuration
└── ...
gradle/
├── libs/                               # Version catalogs
│   └── libs.versions.toml              # Dependency versions
└── wrapper/                            # Gradle wrapper
    ├── gradle-wrapper.jar
    └── gradle-wrapper.properties
build.gradle.kts                        # Root build configuration
settings.gradle.kts                     # Settings including app module
gradle.properties                       # Gradle properties
```

### Dependencies
See `gradle/libs.versions.toml` for all dependency versions.

### Next Steps
- Add your app screens in the `ui` package
- Create ViewModels for each screen
- Add data layers (repository, API services, local database)
- Implement navigation using `navigation-compose`
- Add unit and instrumented tests

### License
This template is available under the MIT license. See the LICENSE file for details.# scoobyy
