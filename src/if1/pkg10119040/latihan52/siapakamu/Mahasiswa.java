/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119040.latihan52.siapakamu;

/**
 *
 * @author User
 * Nama : Agus Deri Dermawan
 * NIM  : 10119040
 * Kelas: IF1
 * program ini berisi program menenampilkan siapa kamu
 * dengan metode pendekatan berbasis objek
 */
public class Mahasiswa extends Manusia {
    private String nim,kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    public void kelasApa (){
       System.out.println(" “Saya Rizki Dwi Nugraha umur 19 tahun sedang belajar di kelas PBOIF2”"); 
    }
     @Override
     public  void siapaKamu(){
    System.out.println("“Saya Mahasiswa”");
    }
}
