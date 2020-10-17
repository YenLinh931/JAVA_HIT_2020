package Bai4;

import java.util.Scanner;

public class MAY {
    private String maMay;
    private String kieuMay;
    private String tinhTrang;

    public void NHAP(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập mã máy: ");
        maMay=sc.nextLine();
        System.out.print("Nhập kiểu máy: ");
        kieuMay=sc.nextLine();
        System.out.print("Nhập tình trạng máy: ");
        tinhTrang=sc.nextLine();
    }
    public void XUAT(){
        System.out.println("Mã máy: "+maMay);
        System.out.println("Kiểu máy: "+kieuMay);
        System.out.println("Tình trạng máy: "+tinhTrang);

    }

}
