import java.util.Scanner;

public class Kuis06Fathan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int porsi;
        int total = 0;
        int jumlahTransaksi = 0;
        int porsiTerbanyak = 0;

        System.out.print("Jumlah porsi (0 = selesai): ");
        porsi = sc.nextInt();

        while (porsi != 0) {
            // Harga: porsi pertama Rp 15000, porsi berikutnya Rp 12000 per porsi

            if (porsi >= 1 && porsi <= 10) {
                if (porsi == 1) {
                    total += 15000;
                } else {
                    total += 15000 + (porsi - 1) * 12000;
                }
            } else {
                System.out.println("Input tidak valid.");
            }

            int biaya = 15000 + (porsi - 1) * 12000;
            System.out.println("Biaya: Rp " + biaya);
            System.out.print("Jumlah porsi (0 = selesai): ");
            porsi = sc.nextInt();
            jumlahTransaksi++;
            if (porsi > porsiTerbanyak) {
                porsiTerbanyak = porsi;
            }
        }

        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah transaksi : " + jumlahTransaksi);
        System.out.println("Porsi Terbanyak dalam 1 Transaksi : " + porsiTerbanyak + " porsi");

        total = total * jumlahTransaksi;
        System.out.println("Total pemasukan  : Rp " + total);
        System.out.println("Jumlah Transaksi Yang lebih dari 2 Porsi : " + (jumlahTransaksi - 1));
    }
}
