package Modul2.Task3;
/**
 * Kelas WaterTrackerManager mengelola pelacakan konsumsi air harian pengguna.
 * Menyimpan total air yang telah dikonsumsi dan memeriksa progres terhadap target.
 *
 * @author Developer
 * @version 1.0
 */
class WaterTrackerManager {
    private double totalConsumed = 0.0;
    private double goal;

    /**
     * Konstruktor untuk membuat objek WaterTrackerManager
     *
     * @param goal Target air harian yang ingin dicapai (dalam liter)
     */

    public WaterTrackerManager(double goal) {
        this.goal = goal;
    }

    /**
     * Menambahkan jumlah air yang baru saja diminum ke total konsumsi
     *
     * @param amount Jumlah air yang diminum dalam liter
     */
    public void addDrink(double amount) {
        totalConsumed += amount;
        if (totalConsumed > goal) {
            totalConsumed = goal;
        }
    }

    /**
     * Menghitung sisa air yang masih perlu diminum untuk mencapai target
     *
     * @return double Sisa air yang perlu diminum dalam liter
     */
    public double getRemaining() {
        return goal - totalConsumed;
    }
    /**
     * Mendapatkan total air yang telah dikonsumsi sejauh ini
     *
     * @return double Total air yang telah dikonsumsi dalam liter
     */

    public double getTotalConsumed() {
        return totalConsumed;
    }
    /**
     * Memeriksa apakah target air harian telah tercapai
     *
     * @return boolean True jika target tercapai, false jika belum
     */
    public boolean isGoalReached() {
        return totalConsumed >= goal;
    }
}
