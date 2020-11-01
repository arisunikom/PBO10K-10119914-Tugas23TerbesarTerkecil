/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas23;
import java.util.Scanner;

/**
 *
 * @author
 * Aris Prabowo
 * 10119914 - IF10K
 */
public class Main {
    public static void main(String[] args) {
        String petugas;
        int JumlahMahasiswa;
        int NilaiTerbesar, NilaiTerkecil;
        int[] NilaiMahasiswa;
        var Keyboard = new Scanner(System.in);
        
        System.out.println("========Program Nilai Terbesar dan Terkecil========");
        
        System.out.println("Masukan Nama Petugas: ");
        petugas = Keyboard.next();
        
        System.out.println("Masukan Jumlah Mahasiswa: ");
        JumlahMahasiswa = Keyboard.nextInt();
        
        NilaiMahasiswa = new int[JumlahMahasiswa];
        NilaiTerbesar = 0;
        NilaiTerkecil = 0;
        
        for(var i=0; i<JumlahMahasiswa;i++){
            if(i==0){
                System.out.println("Masukan Nilai Mahasiwa ke-"+(i+1)+" : ");
                NilaiMahasiswa[i] = Keyboard.nextInt();
                NilaiTerkecil = NilaiMahasiswa[i];
                NilaiTerbesar = NilaiMahasiswa[i];
            }else{
                System.out.println("Masukan Nilai Mahasiwa ke-"+(i+1)+" : ");
                NilaiMahasiswa[i] = Keyboard.nextInt();
                if(NilaiMahasiswa[i] > NilaiTerbesar){
                    NilaiTerbesar = NilaiMahasiswa[i];
                }else if(NilaiMahasiswa[i] < NilaiTerkecil){
                    NilaiTerkecil = NilaiMahasiswa[i];
                }
            }
        }
        
        System.out.println("\n========Hasil Nilai========");
        for(var i=0; i<JumlahMahasiswa;i++){
            System.out.println("Nilai Mahasiswa ke-"+(i+1)+": "+NilaiMahasiswa[i]);
        }
        System.out.println("\nNilai Terbesar: "+NilaiTerbesar);
        System.out.println("Nilai Terkecil: "+NilaiTerkecil);
        System.out.println("\nPetugas: "+petugas);
    }   
}
