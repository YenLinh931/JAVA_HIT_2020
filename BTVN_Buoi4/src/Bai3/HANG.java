package Bai3;

import java.util.Scanner;

public class HANG {
    private String maHang;
    private String tenHang;
    private float donGia;

    public void NHAP(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập mã hàng: ");
        maHang=sc.nextLine();
        System.out.print("Nhập tên hàng: ");
        tenHang=sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        donGia=sc.nextFloat();
    }
    public void XUAT(){
        System.out.println("Mã Hàng: "+maHang);
        System.out.println("Tên Hàng: "+tenHang);
        System.out.println("Đơn Gía: "+donGia);
    }
}
