package part1;

import java.util.Scanner;

// 5
// Menentukan suatu bilangan postitif apakah genap ganjil
// (bila inputan negatif maka ganjil/genap tidak akan
// ditentukan hanya keterangan nilai negatif dan langsung
// keluar program)


// Start
    // int `bilangan`

    // Input `bilangan`

    // Jika `bilangan < 0` maka:
    //     Tampilkan "Bilangan negatif, program dihentikan."
    //     Keluar dari program

    // Jika `bilangan % 2 == 0` maka:
    //     Output "Bilangan [bilangan] adalah bilangan genap."
    // Selain itu:
    //     Output "Bilangan [bilangan] adalah bilangan ganjil."
// End


public class CekGenapGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input bilangan integer
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();
        
        // Mengecek apakah bilangan negatif
        if (bilangan < 0) {
            System.out.println("Bilangan negatif, program hanya menerima bilangan positif!");
        } else {
            // Menentukan apakah bilangan genap atau ganjil
            if (bilangan % 2 == 0) {
                System.out.println("Bilangan " + bilangan + " adalah bilangan genap.");
            } else {
                System.out.println("Bilangan " + bilangan + " adalah bilangan ganjil.");
            }
        }
        
        input.close();
    }
}
