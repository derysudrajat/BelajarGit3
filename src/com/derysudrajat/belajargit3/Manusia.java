package com.derysudrajat.belajargit3;

public class Manusia {
    private int umur;
    private String nama;
    private String jabatan;

    public Manusia(int umur, String nama, String jabatan) {
        this.umur = umur;
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }
}
