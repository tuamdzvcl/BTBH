package com.example.myapplicationddd;

public class SanPham {
    private String TenSp;
    private int SoLuong;
    private int giaSP;
    private int hinh;

    public SanPham(String tenSp, int soLuong, int giaSP, int hinh) {
        this.TenSp = tenSp;
        this.SoLuong = soLuong;
        this.giaSP = giaSP;
        this.hinh = hinh;
    }

    public String getTenSp() {
        return TenSp;
    }

    public void setTenSp(String tenSp) {
        TenSp = tenSp;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        SoLuong = soLuong;
    }

    public int getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(int giaSP) {
        this.giaSP = giaSP;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}