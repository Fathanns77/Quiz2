import java.util.Scanner;

public class Kuis06Fathan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int porsi;
        int total = 0;
        int jumlahTransaksi = 0;

        System.out.print("Jumlah porsi (0 = selesai): ");
        porsi = sc.nextInt();

        while (porsi != 0) {
            // Harga: porsi pertama Rp 15000, porsi berikutnya Rp 12000 per porsi

            int biaya = 15000 + (porsi - 1) * 12000;
            total = 0;
            total += biaya;
            System.out.println("Biaya: Rp " + biaya);
            System.out.print("Jumlah porsi (0 = selesai): ");
            porsi = sc.nextInt();
            jumlahTransaksi++;
        }

        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah transaksi : " + jumlahTransaksi);

        total = total * jumlahTransaksi;
        System.out.println("Total pemasukan  : Rp " + total);
    }
}