package com.ra.demo231204;

import java.util.Scanner;

public class Employee {
    private String eCode;
    private String name;
    private int age;
    private boolean sex;
    private double salary;
    private String phone;

    public Employee() {
    }
    public Employee(String eCode, String name, int age, boolean sex, double salary, String phone) {
        this.eCode = eCode;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.salary = salary;
        this.phone = phone;
    }

    public String geteCode() {
        return eCode;
    }

    public void seteCode(String eCode) {
        this.eCode = eCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean getSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào mã nhân viên: ");
        eCode = sc.nextLine();
        System.out.println("Nhập vào họ và tên nhân viên: ");
        name = sc.nextLine();
        System.out.println("Nhập vào tuổi: ");
        age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập vào giới tính: ");
        sex = Boolean.parseBoolean(sc.nextLine());
        System.out.println("Nhập vào mức lương: ");
        salary = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập vào số điện thoại: ");
        phone = sc.nextLine();

    }

    public void displayData(){
        System.out.println("Mã nhân viên: "+eCode);
        System.out.println("Họ và tên nhân viên: "+name);
        System.out.println("Tuổi: "+age);
        System.out.println("Giới tính: "+(sex? "Nam": "Nữ"));
        System.out.println("Mức lương: "+salary);
        System.out.println("Số điện thoại: "+phone);
    }

}
