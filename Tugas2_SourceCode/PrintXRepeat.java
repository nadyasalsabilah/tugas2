/* Nama     : Nadya Salsabilah
 * NIM      : 13020210302
 * Hari/Tgl : Kamis 23-03-2023
 * Waktu    : 17.45 AM
 */
package printxrepeat;
import java.util.Scanner;
public class PrintXRepeat {
    public static void main(String[] args) {
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Masukkan nilai x (int), akhiri dg999 : ");
        x = masukan.nextInt();
        if (x == 999){
            System.out.print("Kasus kosong \n");
        }else{  /* MInimal ada satu data yang dijumlahkan */
        Sum = 0;
        do{
            Sum = Sum + x;
            System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
            x = masukan.nextInt();
            } while (x != 999); 
        System.out.println ("Hasil penjumlahan = "+Sum);
        }
    }
     
   }
