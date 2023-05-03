/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan03.pkg222.pkg4a;

/**
 *
 * @author asus
 */
public class OperasiPercabangan {
    public static void main(String[] args) {
        double uangKas = 50000;
        double belanja = 40000;
        if(uangKas>belanja){
            double angsul = uangKas - belanja;
            System.out.println("Uang Anda Cukup, dan kembalian: "+angsul);
        } else {
            System.out.println("Uang Anda Kurang");
        }
    }
}
