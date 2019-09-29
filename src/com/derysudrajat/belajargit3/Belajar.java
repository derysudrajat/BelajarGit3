package com.derysudrajat.belajargit3;
import static com.derysudrajat.belajargit3.Manusia.*;
public class Belajar {
    public static void main(String[] args) {
        int umur;
        String nama;
        String jabatan;

        System.out.println("Hello Github, Saya udah ubah tulsannya");

        umur = 17;
        nama = "Si Bejo";
        jabatan = "Penyihir";

        Manusia bejo = new Manusia(umur,nama,jabatan);

        System.out.println("Nama: "+bejo.getNama()+"\n" +
                "Umur: "+bejo.getUmur()+"\n" +
                "Cita-Cita: "+bejo.getJabatan());
    }
}
