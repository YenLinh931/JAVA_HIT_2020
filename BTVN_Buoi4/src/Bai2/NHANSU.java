package Bai2;

import java.util.Scanner;

public class NHANSU {
    private String maNS;
    private String hoTen;
    DATE NS;

    public void NHAP(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập mã nhân sự: ");
        maNS=sc.nextLine();
        System.out.print("Nhập họ và tên: ");
        hoTen=sc.nextLine();
        NS=new DATE();
        NS.NHAP();
    }
    public void XUAT(){
        System.out.println("Mã Nhân Sự: "+maNS);
        System.out.println("Họ Và Tên: "+hoTen);
        NS.XUAT();
    }
}
