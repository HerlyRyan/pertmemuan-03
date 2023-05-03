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
public class OperasiPercabanganSwitchCase {
    public static void main(String[] args) {
        char nilai = 'D';
        switch(nilai){
            case 'A':
                System.out.println("Selamat Nilai Anda Sangat Baik");
                break;
            case 'B':
                System.out.println("Selamat Nilai Anda Lumayan Baik");
                break;
            case 'C':
                System.out.println("Selamat Nilai Anda Cukup Baik");
                break;
            case 'D':
                System.out.println("Tingkatkan Lagi Belajarnya! Jangan Malas!");
                break;
            default:
                System.out.println("Waw Anda harus mengulang Mata Kuliah Ini");
                break;     
        }
    }
}
