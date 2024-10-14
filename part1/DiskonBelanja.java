package part1;

import java.util.Scanner;

// Pseudocode


public class DiskonBelanja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah belanja
        System.out.print("Masukkan jumlah belanja: ");
        double totalBelanja = scanner.nextDouble();
        
        // Variabel untuk diskon dan total bayar
        double diskon = 0;

        // Logika perhitungan diskon
        if (totalBelanja >= 100000) {
            diskon = 0.10; // Diskon 10%
        } else if (totalBelanja >= 50000) {
            diskon = 0.05; // Diskon 5%
        } else {
            diskon = 0; // Tidak ada diskon
        }

        // Menghitung jumlah diskon dan total bayar
        double jumlahDiskon = totalBelanja * diskon;
        double totalBayar = totalBelanja - jumlahDiskon;

        // Menampilkan hasil
        System.out.println("Jumlah diskon: Rp " + jumlahDiskon);
        System.out.println("Total bayar setelah diskon: Rp " + totalBayar);

        scanner.close();
    }
}
