/* Nama     : Nadya Salsabilah
 * NIM      : 13020210302
 * Hari/Tgl : Kamis 23-03-2023
 * Waktu    : 16.42 AM
 */
package printiterasi;
import java.util.Scanner;
public class PrintIterasi {
    public static void main(String[] args) {
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        System.out.print ("Nilai N >0 = ");
        N = masukan.nextInt();
        i = 1; 
        System.out.print ("Print i dengan ITERATE : \n");
        for (;;){
            System.out.println(i);
            if (i == N)
            break;
            else {
                    i++;
            }
            
        }
    }
    
}

