/* Nama     : Nadya Salsabilah
 * NIM      : 13020210302
 * Hari/Tgl : Kamis 23-03-2023
 * Waktu    : 17.00 AM
 */
package printwhile;
import java.util.Scanner;
public class PrintWhile {
    public static void main(String[] args) {
     // TODO Auto-generated method stub
     /* Kamus : */
     int N;
     int i;
     Scanner masukan=new Scanner(System.in);
     /* Program */
     System.out.print ("Nilai N >0 = "); /* Inisialisasi */
     N = masukan.nextInt();
     i = 1; /* First Elmt */
     System.out.print ("Print i dengan WHILE: \n");
     while (i <= N) /* Kondisi pengulangan */
     { System.out.println (i); /* Proses */
     i++;
     }; /* (i > N) */
    }
    
}
