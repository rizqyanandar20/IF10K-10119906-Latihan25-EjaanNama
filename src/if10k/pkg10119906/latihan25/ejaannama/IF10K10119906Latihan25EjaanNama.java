/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if10k.pkg10119906.latihan25.ejaannama;
import java.util.Scanner;

/**
 *
 * @author senenngahenen
 * Nama     : rizqy ananda rusmana
 * NIM      : 10119906
 * Kelas    : IF-10K
 * Deskripsi program : Ejaan Nama dengan angka
 */
public class IF10K10119906Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Nama;
        int Panjang;
        char huruf;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Nama depan untuk di eja : ");
        Nama = scanner.nextLine();
        
        Panjang = Nama.length();
        
        System.out.println("Ejaan untuk " + Nama + " adalah : ");
        
        for (int i = 0; i < Panjang; i++){
            System.out.println("Huruf ke-" + (i+1) + " : " + Nama.charAt(i));
        }
        
    }
    
}
