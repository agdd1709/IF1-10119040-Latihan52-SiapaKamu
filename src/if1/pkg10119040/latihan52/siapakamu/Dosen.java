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
public class Dosen extends Manusia {
    private String nip,mataKuliah;

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    public void mengajarApa(){
        System.out.println("“Saya Rizki Adam Kurniawan umur 27 tahun sedang mengajar matakuliah PBO”");
    }
    @Override
    public void siapaKamu(){
        System.out.println("“Saya Dosen”");
    }
}
