package com.example.arien.mugidyamafarienthilmi_1202154294_modul2;

/**
 * Created by ASUS on 2/18/2018.
 */

public class Menu {
    int photo;
    private String nama, harga, detail;

    public Menu(int photo, String nama, String harga, String detail) {
        this.photo = photo;
        this.nama = nama;
        this.harga = harga;
        this.detail = detail;
    }
    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getdetail() {
        return detail;
    }

    public void setdetail(String detail) {
        this.detail = detail;
    }
}