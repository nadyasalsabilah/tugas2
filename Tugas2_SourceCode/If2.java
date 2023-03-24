/* Nama     : Nadya Salsabilah
 * NIM      : 13020210302
 * Hari/Tgl : Kamis 23-03-2023
 * Waktu    : 15.00 AM
*/
package if2;
import java.util.Scanner;
public class If2 {
    public static void main(String[] args) {
        int a;
        Scanner masukan=new Scanner(System.in);
        System.out.print ("Contoh IF dua kasus \n");
        System.out.print ("Ketikkan suatu nilai integer :"); 
        a=masukan.nextInt();
        if (a >= 0){
            System.out.println ("Nilai a positif "+ a);
            }else
            {
            System.out.println ("Nilai a negatif "+ a);
        }
    }
    
}
