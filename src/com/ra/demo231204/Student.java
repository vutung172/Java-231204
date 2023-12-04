package com.ra.demo231204;

import java.util.Scanner;

public class Student {

    // Thuoc tinh student
    private String msv;
    private String hoTen;
    private String sdt;
    private String lop;

    public Student() {
    }

    //Constructor

    public Student(String msv, String hoTen, String sdt, String lop) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.sdt = sdt;
        this.lop = lop;
    }

    //Getter and Setter


    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã số sv:");
        msv = sc.nextLine();
        System.out.println("Nhập vào tên sv");
        hoTen = sc.nextLine();
        System.out.println("Nhập vào số điện thoại");
        sdt = sc.nextLine();
        System.out.println("Nhập vào lớp cảu sinh vien");
        lop = sc.nextLine();

    }

    public void displayData(){
        System.out.println("Mã sinh viên:"+msv);
        System.out.println("Họ và tên:"+hoTen);
        System.out.println("Số điện thoại"+sdt);
        System.out.println("Lớp học:"+lop);
    }
}
