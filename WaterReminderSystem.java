package Modul2.Task3;

import java.util.Scanner;
/**
 * Kelas utama WaterReminderSystem yang menjalankan aplikasi pengingat minum air.
 * Menyediakan antarmuka pengguna untuk menginput data dan melacak konsumsi air.
 *
 * @author Developer
 * @version 1.0
 */

public class WaterReminderSystem {

    /**
     * Metode utama yang menjalankan aplikasi Water Reminder System
     *
     * @param args Argumen command line (tidak digunakan)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== WATER REMINDER SYSTEM  =====");
        System.out.print("Masukkan nama Anda: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan usia Anda: ");
        int age = scanner.nextInt();

        System.out.print("Masukkan berat badan Anda (kg): ");
        double weight = scanner.nextDouble();

        User user = new User(name, age, weight);
        WaterTrackerManager tracker = new WaterTrackerManager(user.getDailyGoal());

        System.out.println("\nHalo, " + user.getName() + "!");
        System.out.printf("Target minum harian Anda: %.2f liter%n", user.getDailyGoal());
        System.out.println("---------------------------------------");

        boolean running = true;
        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambahkan jumlah air yang diminum");
            System.out.println("2. Lihat progres");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan jumlah air (liter): ");
                    double amount = scanner.nextDouble();
                    tracker.addDrink(amount);
                    System.out.printf(" Ditambahkan %.2f liter. Total saat ini: %.2f liter%n",
                            amount, tracker.getTotalConsumed());
                    break;
                case 2:
                    System.out.printf("Total diminum: %.2f liter dari %.2f liter%n",
                            tracker.getTotalConsumed(), user.getDailyGoal());
                    if (tracker.isGoalReached()) {
                        System.out.println(" Selamat! Anda sudah mencapai target minum hari ini!");
                    } else {
                        System.out.printf("Masih perlu %.2f liter lagi.%n", tracker.getRemaining());
                    }
                    break;
                case 3:
                    System.out.println(" Terima kasih telah menggunakan Water Reminder System!");
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        }

        scanner.close();
    }
}