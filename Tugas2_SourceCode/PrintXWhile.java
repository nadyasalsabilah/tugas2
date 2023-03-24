/* Nama     : Nadya Salsabilah
 * NIM      : 13020210302
 * Hari/Tgl : Kamis 23-03-2023
 * Waktu    : 19.00 PM
 */
package printxwhile;
import java.util.Scanner;
public class PrintXWhile {
    public static void main(String[] args) {
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in);
        Sum = 0;
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x= masukan.nextInt();
                while (x != 999) {
                    Sum = Sum + x; 
                    System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
                    x = masukan.nextInt();
                }
                System.out.println("Hasil penjumlahan = "+ Sum);

    }
    
}
