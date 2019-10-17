/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan37.programrataratanilai;
import java.util.Scanner;
/**
 *
 * @author user
 */
class Dosen {
    private int inputMahasiswa;
    private int n,jml,nilai[];
    private float jumlah,rata=0;
    
    
    public int getInputMahasiswa() {
        return inputMahasiswa;
    }

    public void setInputMahasiswa(int inputMahasiswa) {
        this.inputMahasiswa = inputMahasiswa;
    }
    
    public int inputMahasiswa(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Banyaknya mahasiswa : ");
        n=input.nextInt();
    return n;    
    
    }
   public int[] inputNilai(){
        Scanner input = new Scanner(System.in);
        nilai = new int[n];
        for (int i=0;i<= n-1; i++){
            System.out.print("Nilai mahasiswa ke- " +(i+1)+": ");
            nilai[i]= input.nextInt();
            
        }
        //        
        for (int j=0;j<= n-1; j++){
            jumlah=jumlah +nilai[j];
            
        }
        return nilai;   
   } 
   public float hitungRatRata(){
     rata=jumlah/n; 
   return rata;
   }


}
