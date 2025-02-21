/* Data Structures Kelompok 8:
 * - Ellen Elvira (535240023)
 * - Hannah Larissa Halim (535240015)
 * - Lyvia Reva Ruganda (535240028) */

 import java.util.Scanner;

public class RecursivePractice1 {
    //No 2 Praktikum
    public static String genapRekursif(int a, int b) {
        if (a > b) {
            return ""; // Base case: bila a lebih besar dari b maka berhenti
        }
        if (a % 2 != 0) {
            return genapRekursif(a + 1, b); // akan diabaikan ketika ganjil
        }
        return a + (a + 2 <= b ? ", " + genapRekursif(a + 2, b) : ""); //Lanjut rekursif 
    }

    // No 4 Praktikum (Rekursif GCD)
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
        if (kiri >= kanan) {
            return; // Base case: Stop ketika indeks kiri lebih besar sama dngn indeks kanan
        }
        // Pergantian posisi antara angka di kiri dan kanan
        int temp = arr[kiri];
        arr[kiri] = arr[kanan];
        arr[kanan] = temp;
        // Panggil fungsi rekursif
        urutBalik(arr, kiri + 1, kanan - 1);
    }

    // Main 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // No 1 Ganjil ke Genap
        System.out.print("Enter range (a, b) for even numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Even numbers: " + genapRekursif(a, b));

        // No 2 GCD
        System.out.print("\nEnter two numbers for GCD: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("GCD of " + x + " and " + y + " is: " + gcd(x, y));

        // No 3 Urutan Angka Dibalik
        System.out.print("\nEnter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        urutBalik(arr, 0, size - 1); // panggil fungsi reverse/balik

        // Print the reversed array
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
