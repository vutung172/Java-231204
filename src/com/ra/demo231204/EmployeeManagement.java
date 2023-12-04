package com.ra.demo231204;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        do {
            System.out.println("=====MENU====");
            System.out.println("1. Nhập số nhân viên muốn nhập");
            System.out.println("2. Hiển thị danh sách nhân viên");
            System.out.println("3. tim kiến nhân viên theo mã");
            System.out.println("4. Tìm kiếm theo tên nhân viên");
            System.out.println("5. Thoát");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Số lượng nhân viên muốn nhập vào danh sách: ");
                    int n = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < n; i++){
                        Employee employee = new Employee();
                        employee.inputData();
                        list.add(employee);
                    }
                    break;
                case 2:
                    System.out.println("Danh sách nhân viên");
                    for (Employee e: list) {
                        e.displayData();
                    }
                    break;
                case 3:
                    System.out.println("Nhập mã nhân viên bạn muốn tìm");
                    String eSearch = sc.nextLine();

                    for (Employee e:list) {
                        String code = e.geteCode();
                        if (code.equals(eSearch)) {
                            e.displayData();
                            break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập tên nhân viên bạn muốn tìm:");
                    String nameSearch = sc.nextLine().toLowerCase();

                    for (Employee e: list) {
                        String name = e.getName().toLowerCase();

                        if (name.contains(nameSearch)) {
                            e.displayData();
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Số bạn chọn không hợp lệ");
            }

        } while (true);


    }
}
