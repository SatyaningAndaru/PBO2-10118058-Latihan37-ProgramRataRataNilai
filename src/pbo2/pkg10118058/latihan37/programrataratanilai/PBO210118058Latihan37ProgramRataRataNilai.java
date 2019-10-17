/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan37.programrataratanilai;

/**
 *
 * @author user
 */
public class PBO210118058Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     * Nama : Satyaning Anadaru Bawalaksana
     * Nim : 10118058
     * Kelas : If-2
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dosen mahasiswa=new Dosen();
        mahasiswa.inputMahasiswa();
        mahasiswa.inputNilai();
        System.out.println("");
        System.out.println("Maka Rata-rata Nilainya adalah " +mahasiswa.hitungRatRata());
        System.out.println("Developed By Satyaning andaru Bawalaksana");
        
    }
    
}
