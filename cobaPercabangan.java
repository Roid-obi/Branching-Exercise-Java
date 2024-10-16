import java.util.Scanner;

// Pseudocode
// Star
// String nama, keterangan, nilaiHuruf
// double nilai
// input nama
// input nilai
// 
// End

public class cobaPercabangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // inisialisasi
        String nama, keterangan, nilaiHuruf;
        double nilai;

        // Input nama mahasiswa
        System.out.print("Masukkan nama mahasiswa: ");
        nama = scanner.nextLine();

        // Menggunakan perulangan untuk validasi nilai
        while (true) {
            System.out.print("Masukkan nilai mahasiswa: ");
            nilai = scanner.nextDouble();

            // Validasi nilai
            if (nilai > 100 || nilai < 0) {
                System.out.println("Nilai tidak valid. Silakan masukkan nilai antara 0 dan 100.");
            } else {
                break; // Keluar dari loop jika nilai valid
            }
        }

        // Menggunakan ternary untuk menentukan kelulusan
        keterangan = (nilai >= 60) ? "lulus" : "tidak lulus";

         // Konversi nilai ke huruf
        if (nilai <= 49) {
            nilaiHuruf = "E";
        } else if (nilai >= 50 && nilai <= 59) {
            nilaiHuruf = "D";
        } else if (nilai >= 60 && nilai <= 74) {
            nilaiHuruf = "C";
        } else if (nilai >= 75 && nilai <= 84) {
            nilaiHuruf = "B";
        } else {
            nilaiHuruf = "A";
        }

        // Menampilkan hasil
        System.out.println("Mahasiswa " + nama + " dinyatakan " + keterangan + ".");
        System.out.println("Nilai kamu: " + nilaiHuruf);

        scanner.close();

    }
}
