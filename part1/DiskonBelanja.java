package part1;

import java.util.Scanner;

// 1
// Menghitung diskon belanja dan bayar setalah diskon
// dengan ketentuan diskon 10% untuk belanja >=100 ribu
// atau 5% untuk belanja >=50 ribu atau tidak diskon sama sekali


// Pseudocode
// Start
    // double `totalBelanja`, `diskon`, `jumlahDiskon`, `totalBayar`

    // Input `totalBelanja`
    
    // IF `totalBelanja` >= 100000 
        // diskon = 0.10
    // ELSE IF `totalBelanja` >= 50000 
        // diskon = 0.05
    // ELSE
        // diskon = 0

    // Hitung jumlahDiskon = `totalBelanja` * `diskon`
    // Hitung totalBayar = `totalBelanja` - `jumlahDiskon`

    // Output `jumlahDiskon`
    // Output `totalBayar`
// End


public class DiskonBelanja {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah belanja
        System.out.print("Masukkan jumlah bayar belanjaan: ");
        double totalBelanja = input.nextDouble();
        
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

        input.close();
    }
}
