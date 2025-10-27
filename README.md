# JavaLiveM3
# 💧 Water Reminder System

## 📋 Deskripsi
Water Reminder System adalah aplikasi Java sederhana yang membantu pengguna melacak konsumsi air harian mereka. Aplikasi ini menghitung target air minum berdasarkan berat badan pengguna dan menyediakan antarmuka untuk mencatat serta memantau progres konsumsi air.

## 🏗 Struktur Program

### Kelas-kelas Utama

#### 1. User
Kelas yang merepresentasikan pengguna sistem dengan atribut:
- name - Nama pengguna
- age - Usia pengguna
- weight - Berat badan pengguna (kg)
- dailyGoal - Target air harian (liter)

*Metode Utama:*
- calculateDailyWaterGoal() - Menghitung target air berdasarkan berat badan
- getDailyGoal() - Mengembalikan target air harian
- getName() - Mengembalikan nama pengguna

#### 2. WaterTrackerManager
Kelas yang mengelola pelacakan konsumsi air dengan atribut:
- totalConsumed - Total air yang telah dikonsumsi
- goal - Target air harian

*Metode Utama:*
- addDrink(double amount) - Menambahkan konsumsi air baru
- getRemaining() - Menghitung sisa air yang perlu diminum
- isGoalReached() - Memeriksa apakah target telah tercapai

#### 3. WaterReminderSystem
Kelas utama yang menjalankan aplikasi dengan antarmuka menu interaktif.

## 🚀 Cara Menjalankan

1. *Kompilasi Program:*
   ```bash
   javac Modul2/Task3/*.java
