package Modul2.Task3;
/**
 * Kelas User merepresentasikan pengguna sistem Water Reminder.
 * Menyimpan informasi pribadi pengguna dan menghitung target air harian.
 *
 * @author Developer
 * @version 1.0
 */

class User {
    /**
     * Rasio air harian yang dibutuhkan per kilogram berat badan (dalam liter)
     */
    public static final double DAILY_WATER_RATIO = 0.033;
    private String name;
    private int age;
    private double weight; // dalam kilogram
    private double dailyGoal; // liter

    /**
     * Konstruktor untuk membuat objek User baru
     *
     * @param name Nama pengguna
     * @param age Usia pengguna
     * @param weight Berat badan pengguna dalam kilogram
     */

    public User(String name, int age, double weight) {
        this.setName(name);
        this.age = age;
        this.weight = weight;
        this.dailyGoal = calculateGoal();
    }

    /**
     * Menghitung kebutuhan air harian berdasarkan berat badan
     *
     * @return double Target air harian dalam liter
     */

    // Menghitung kebutuhan air berdasarkan berat badan
    private double calculateGoal() {
        return calculateDailyWaterGoal();// extract method
    }
    /**
     * Menghitung target air minum harian menggunakan rasio standar
     *
     * @return double Jumlah air yang perlu diminum per hari dalam liter
     */

    private double calculateDailyWaterGoal() {
        return weight * DAILY_WATER_RATIO; // refactor inline variable dan refactor introduce constant
    }
    /**
     * Mendapatkan target air minum harian pengguna
     *
     * @return double Target air harian dalam liter
     */

    public double getDailyGoal() {
        return dailyGoal;
    }
    /**
     * Mendapatkan nama pengguna
     *
     * @return String Nama pengguna
     */
     // refactoring encapsulate field
    public String getName() {
        return name;
    }
    /**
     * Mengatur nama pengguna
     *
     * @param name Nama baru untuk pengguna
     */
    public void setName(String name) {
        this.name = name;
    }
}
