# AviGarden - Intelligent Backyard Birding & Feeder Companion

> Track sightings, monitor feeders, and discover local migrations in real-time.

**Birdwatching / Nature / Wildlife Analytics** built with Kotlin and modern Android development standards.

---

## 🚀 Features

- **Geo Tracking And Sighting Log**: A high-precision, offline-first species sighting recorder mapping bird encounters to spatial coordinates.
  - Auto-Location Mapping: Hook into Google Play Services FusedLocationProviderClient to silently capture high-accuracy GPS coordinates during sighting logs.
  - Dynamic Sighting Form: Support logging species names (backed by a localized pre-loaded SQLite database of common birds), flock size, active behavior (feeding, flying, nesting), user remarks, and system-registered media photo paths.
  - Weather Integration: Fetch a local snapshot of wind, temperature, and sky conditions during the sighting event to correlate bird presence with localized climate patterns.
- **Smart Feeder Monitor**: Calculates, tracks, and visualizes replenishment levels and bird traffic for backyard feeders.
  - Visual Feeder Cylinders: Custom-rendered Compose Canvas components displaying a liquid-like animation representing seed, suet, or nectar food levels (0-100%).
  - Decay Tracking: Algorithmic estimations of seed depletion speeds based on user logs and feeder traffic, with custom reminders when levels drop below 15%.
- **Local Migration Alert System**: Proximity-based tracking of targeted or rare species within a user-defined radius.
  - Integrate an background service executing periodic checks using WorkManager (respecting battery-saving rules) that compares local coordinates with aggregated regional birding API reports (such as eBird API).
  - Dispatch rich notifications with target bird silhouettes and estimated distances to alert users of nearby rare arrivals.
- **Custom Compose Charts**: Interactive, custom-drawn Jetpack Compose Canvas charts mapping birder analytics.
- **Admob Monetization Layer**: 

---

## 🛠️ Tech Stack & Architecture

- **Language**: Kotlin
- **UI Framework**: Jetpack Compose (Material Design 3)
- **Architecture**: MVVM + Clean Architecture
- **Local Storage**: Room Database & DataStore
- **Async Operations**: Kotlin Coroutines & StateFlow
- **Build System**: Gradle Kotlin DSL
- **Min SDK**: 26 | **Target SDK**: 34

---

## 💻 Getting Started

### Prerequisites
- Android Studio Ladybug (2024.2.1+) or newer
- JDK 17+
- Android SDK 34+

### Building & Running
1. Clone the repository:
   ```bash
   git clone https://github.com/hsinidev/AviGarden.git
   cd AviGarden
   ```
2. Open the project in Android Studio.
3. Sync Gradle dependencies and run on an Android device or emulator.

---

## 📬 Contact & Support

Created and maintained by **Hsini**.

- **Website**: [hsini.dev](https://hsini.dev)
- **Email**: [contact@hsini.dev](mailto:contact@hsini.dev)
- **GitHub**: [@hsinidev](https://github.com/hsinidev)

---

© 2026 [hsini.dev](https://hsini.dev). All rights reserved.
