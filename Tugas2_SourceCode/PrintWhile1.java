/* Nama     : Nadya Salsabilah
 * NIM      : 13020210302
 * Hari/Tgl : Kamis 23-03-2023
 * Waktu    : 17.17 AM
 */
package printwhile1;
import java.util.Scanner;
public class PrintWhile1 {
    public static void main(String[] args) {
     // TODO Auto-generated method stub
     /* Kamus : */
     int N;
     int i = 1;
     Scanner masukan=new Scanner(System.in);
     /* Program */
     System.out.print ("Nilai N >0 = ");
     N = masukan.nextInt();
     System.out.print ("Print i dengan WHILE (ringkas): \n");
     while (i <= N){
         System.out.println (i++);
     } /* (i > N)*/

    }
    
}
