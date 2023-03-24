/* Nama     : Nadya Salsabilah
 * NIM      : 13020210302
 * Hari/Tgl : Kamis 23-03-2023
 * Waktu    : 15.14 AM
*/
package if3;
import java.util.Scanner;
public class If3 {
    public static void main(String[] args) {
       int a;
       Scanner masukan=new Scanner(System.in);
       System.out.print ("Contoh IF tiga kasus \n");
       System.out.print ("Ketikkan suatu nilai integer :");
       a=masukan.nextInt();
       if (a > 0){
           System.out.println ("Nilai a positif "+ a);
       }else if  (a == 0){
           System.out.println ("Nilai Nol "+ a);
       }else {
           System.out.println ("Nilai a negatif "+ a);
       }
    }
}

