package Bai4;

import java.util.Scanner;

public class QUANLY {
    private String maQL;
    private String hoTen;

    public void NHAP(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập mã quản lý: ");
        maQL=sc.nextLine();
        System.out.print("Nhập họ và tên: ");
        hoTen=sc.nextLine();
    }
    public void XUAT(){
        System.out.println("Mã quản lý: "+maQL);
        System.out.println("Họ và tên: "+hoTen);
    }
}
