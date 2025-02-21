/* Data Structures Kelompok 8:
 * - Ellen Elvira (535240023)
 * - Hannah Larissa Halim (535240015)
 * - Lyvia Reva Ruganda (535240028) */

 import java.util.Scanner;

public class recursivepractice1 {
    //No 2 Praktikum
    public static String genapRekursif(int a, int b) {
        if (a > b) {
            System.out.println("Angka awal harus lebih kecil dari Angka akhir"); 
            return genapRekursif(a, b); // // Base case: bila a lebih besar dari b maka diulang
        }
        if (a % 2 != 0) {
            return genapRekursif(a + 1, b); // akan diabaikan ketika ganjil
        }
        return a + (a + 2 <= b ? ", " + genapRekursif(a + 2, b) : ""); //Lanjut rekursif 
    }

    // No 4 Praktikum (Rekursif )
    public static int gcd(int x, int y) {
        if (y <= x && x % y == 0) {
         return y; // Jika y <= x dan x mod y == 0, maka gcd(x, y) = y
        } 
        if (x < y) {
        return gcd(y, x); // Jika x < y, tukar posisi x dan y
        }
        return gcd(y, x % y); // Selain dua kondisi di atas, gunakan rekursi gcd(y, x mod y)
}

    // No 6 Praktikum (Membalikkan urutan)
    public static void urutBalik(int[] arr, int kiri, int kanan) {
        if (kiri >= kanan) return; // Base case: berhenti jika kiri >= kanan
        int temp = arr[kiri];
        arr[kiri] = arr[kanan];
        arr[kanan] = temp;
        urutBalik(arr, kiri + 1, kanan - 1); // Rekursi untuk membalikkan elemen selanjutnya
    }

    // Main 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // No 1 Ganjil ke Genap
        System.out.println("==========================================================================================");
        System.out.print("Masukkan dua buah angka, angka awal lebih kecil dari angka akhir, dengan spasi (a b): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("");
        System.out.println("Bilangan Genap dari " +a + " sampai " +b+ " adalah : " + genapRekursif(a, b));
        System.out.println("==========================================================================================");
        System.out.println("");

        // No 2 GCD
        System.out.print("\nMasukkan dua buah angka dengan spasi (x y) :");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Nilai Pembagi Terbesar (GCD) dari " + x + " dan " + y + " adalah: " + gcd(x, y));

        // No 3 Urutan Angka Dibalik
        System.out.print("\nMasukkan Banyaknya Angka: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Masukkan beberapa Angka, dengan spasi :");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        urutBalik(arr, 0, size - 1); // panggil fungsi reverse/balik

        // Print the reversed array
        System.out.println("Urutan Angka diBalik dari belakang ke depan: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
