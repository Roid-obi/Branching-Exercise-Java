package part1;

import java.util.Scanner;

// 3
// Mengurutkan ascending 2 data integer (data1 dan data2
// dengan pencetakan data terurut selalu data data1
// terlebih dahulu kemudian data2 )

// Start
    // int `data1`, `data2`, `data3`, `temp`

    // input `data1`
    // input `data2`
    // input `data3`

    // Jika `data1 > data2` maka:
    //     Simpan `data1` dalam `temp`
    //     Set `data1` = `data2`
    //     Set `data2` = `temp`

    // Jika `data1 > data3` maka:
    //     Simpan `data1` dalam `temp`
    //     Set `data1` = `data3`
    //     Set `data3` = `temp`

    // Jika `data2 > data3` maka:
    //     Simpan `data2` dalam `temp`
    //     Set `data2` = `data3`
    //     Set `data3` = `temp`

    // Tampilkan "Data terurut:"
    // Tampilkan `data1`, `data2`, `data3`
// End



public class UrutkanData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input tiga data integer
        System.out.print("Masukkan data1 (integer): ");
        int data1 = input.nextInt();
        
        System.out.print("Masukkan data2 (integer): ");
        int data2 = input.nextInt();
        
        System.out.print("Masukkan data3 (integer): ");
        int data3 = input.nextInt();
        
        // Mengurutkan tiga data secara ascending
        if (data1 > data2) {
            int temp = data1;
            data1 = data2;
            data2 = temp;
        }
        
        if (data1 > data3) {
            int temp = data1;
            data1 = data3;
            data3 = temp;
        }
        
        if (data2 > data3) {
            int temp = data2;
            data2 = data3;
            data3 = temp;
        }
        
        // Cetak hasil terurut
        System.out.println("Data terurut:");
        System.out.println("data1: " + data1);
        System.out.println("data2: " + data2);
        System.out.println("data3: " + data3);

        input.close();
    }
}