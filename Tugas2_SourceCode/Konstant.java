/* Nama     : Nadya Salsabilah
 * NIM      : 13020210302
 * Hari/Tgl : Kamis 23-03-2023
 * Waktu    : 16.00 AM
 */
package konstant;
import java.util.Scanner;
public class Konstant {
    public static void main(String[] args) {
    // TODO Auto-generated method stub
        /* Kamus */
        final float PHI = 3.1415f;
        float r;
           Scanner masukan=new Scanner(System.in);
      /* program */ /* baca data */
             System.out.print ("Jari-jari lingkaran =");
             r = masukan.nextFloat();
      /* Hitung dan tulis hasil */
            System.out.print ("Luas lingkaran = "+ (PHI * r * r )+"\n");
            System.out.print ("Akhir program \n");
    } 
}
