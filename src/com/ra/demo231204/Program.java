package com.ra.demo231204;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Student> list = new ArrayList<>();


        do {
            System.out.println("====Menu===");
            System.out.println("1. Nhâp vào số sv");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Nhập vào số lượng muốn nhập");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++) {
                        Student student = new Student();
                        student.inputData();
                        list.add(student);
                    }
                    break;
                case 2:
                    System.out.println("Danh sach sv");
                    for (Student st: list) {
                        st.displayData();
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Lựa chọn không phù hợp");

            }
        } while (true);
    }
}
