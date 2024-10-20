package part1;

import java.util.Scanner;

// 4
// Menentukan maksimal dari 3 bilangan integer

// Mulai
    // int `bil1`, `bil2`, `bil3`, `maks`

    // input `bil1`
    // input `bil2`
    // input `bil3`

    // Set `maks` = `bil1`

    // Jika `bil2 > maks` maka:
    //     Set `maks` = `bil2`

    // Jika `bil3 > maks` maka:
    //     Set `maks` = `bil3`

    // Output "Bilangan terbesar adalah: " + `maks`
// Selesai

public class PenentuMaksimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input tiga bilangan integer
        System.out.print("Masukkan bilangan pertama: ");
        int bil1 = input.nextInt();
        
        System.out.print("Masukkan bilangan kedua: ");
        int bil2 = input.nextInt();
        
        System.out.print("Masukkan bilangan ketiga: ");
        int bil3 = input.nextInt();
        
        // Menentukan bilangan terbesar
        int maks = bil1; // Asumsikan bil1 adalah yang terbesar
        
        if (bil2 > maks) {
            maks = bil2; // Jika bil2 lebih besar, maka maks adalah bil2
        }
        
        if (bil3 > maks) {
            maks = bil3; // Jika bil3 lebih besar, maka maks adalah bil3
        }
        
        // Cetak hasil bilangan terbesar
        System.out.println("Bilangan terbesar adalah: " + maks);
        
        input.close();
    }
}
