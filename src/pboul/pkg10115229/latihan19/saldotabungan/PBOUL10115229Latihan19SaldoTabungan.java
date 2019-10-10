/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboul.pkg10115229.latihan19.saldotabungan;

import java.util.Scanner;

/**
 *
 * @author Lukman
 * NIM      : 10115229   
 * NAMA     : MUHAMMAD LUKMAN HAKIM
 * KELAS    : PBO ULANG
 */
public class PBOUL10115229Latihan19SaldoTabungan {
    
        static int saldoAkhir;
        static void hitung (int a,int b){
            saldoAkhir = (a+(a*b/100));
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int saldoAwal;
        int bunga;
        int lamaMenabung;
        int banyakBulan;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan Saldo Awal = ");
        saldoAwal = in.nextInt();
        System.out.println("Masukkan Bunga (dalam%)= ");
        bunga = in.nextInt();
        System.out.println("Masukkan Lama Menabung (dalam bulan)");
        banyakBulan = in.nextInt();
        System.out.println("");
        System.out.println("------------------------------------------------");
        
          for (lamaMenabung=1; lamaMenabung<=banyakBulan; lamaMenabung++) {
              hitung(saldoAwal,bunga);
              
              System.out.println("Bulan ke"+ lamaMenabung);
              System.out.println("Saldo Awal= "+ saldoAwal);
              System.out.println("Bunga= "+bunga+"% per bulan, jadi bunga yang anda dapat= "+saldoAwal*bunga/100);
              System.out.println("Saldo akhir anda adalah= "+saldoAkhir);
              System.out.println("------------------------------------------------------------------------");
              saldoAwal = saldoAkhir;

          }

              System.out.println("");
              System.out.println("Develop By : Muhammad Lukman Hakim");
    }
    
}
