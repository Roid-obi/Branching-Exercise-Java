package part1;

import java.util.Scanner;

// 2
// Dengan pilihan untuk menghitung konversi suhu dari Celcius
// ke Kelvin, Reamur atau fahrenheit (menghitung salah satu)


// Start
    // double `celcius`, `kelvin`, `reamur`, `fahrenheit`
    // char `pilihan`

    // Input `celcius`

    // Input "Pilih konversi suhu (K untuk Kelvin, R untuk Reamur, F untuk Fahrenheit):"

    // Ubah `pilihan` menjadi huruf kapital (gunakan fungsi `toUpperCase`)

    // Jika `pilihan` adalah 'K' maka:
    //     Hitung `kelvin` = `celcius` + 273.15
    //     Tampilkan "Suhu dalam Kelvin: " dan nilai `kelvin`
        
    // Jika `pilihan` adalah 'R' maka:
    //     Hitung `reamur` = `celcius` * 4 / 5
    //     Tampilkan "Suhu dalam Reamur: " dan nilai `reamur`
        
    // Jika `pilihan` adalah 'F' maka:
    //     Hitung `fahrenheit` = (`celcius` * 9 / 5) + 32
    //     Tampilkan "Suhu dalam Fahrenheit: " dan nilai `fahrenheit`

    // Jika `pilihan` bukan 'K', 'R', atau 'F' maka:
    //     Tampilkan "Pilihan tidak valid! Silakan masukkan K, R, atau F."
// End

public class KonversiSuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input suhu dalam Celcius
        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = input.nextDouble();
        
        // Input pilihan konversi (K, R, atau F)
        System.out.print("Pilih konversi suhu (K untuk Kelvin, R untuk Reamur, F untuk Fahrenheit): ");
        char pilihan = input.next().charAt(0);
        
        // Mengonversi huruf kecil menjadi huruf besar
        pilihan = Character.toUpperCase(pilihan);
        
        switch (pilihan) {
            case 'K': // Konversi ke Kelvin
                double kelvin = celcius + 273.15;
                System.out.printf("Suhu dalam Kelvin: %.2f\n", kelvin);
                break;
                
            case 'R': // Konversi ke Reamur
                double reamur = celcius * 4 / 5;
                System.out.printf("Suhu dalam Reamur: %.2f\n", reamur);
                break;
                
            case 'F': // Konversi ke Fahrenheit
                double fahrenheit = (celcius * 9 / 5) + 32;
                System.out.printf("Suhu dalam Fahrenheit: %.2f\n", fahrenheit);
                break;
                
            default: // Jika input tidak valid
                System.out.println("Pilihan tidak valid! Silakan masukkan K, R, atau F.");
        }

        input.close();
    }
}

