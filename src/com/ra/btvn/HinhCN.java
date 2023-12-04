package com.ra.btvn;

import java.util.Scanner;

public class HinhCN {
    //Thuộc tính
    private float chieuDai;
    private float chieuRong;

    public HinhCN() {
    }

    public HinhCN(float chieuDai, float chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public float getChieuDai() {
        return chieuDai;
    }

    public float getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(float chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(float chieuRong) {
        this.chieuRong = chieuRong;
    }

    // phuong thức input data
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào chiều dài");
        chieuDai = Float.parseFloat(sc.nextLine());
        System.out.println("mời nhập chiều rộng");
        chieuRong = Float.parseFloat(sc.nextLine());

    }

    public  void dienTich(){
        float dienTich = chieuDai*chieuRong;
        System.out.println("Dienj tich HCN là: "+dienTich);
    }

    public void chuVi(){
        float chuVi = (chieuDai+chieuRong)*2;
        System.out.println("Chu vi HCN là: "+chuVi);
    }
}
