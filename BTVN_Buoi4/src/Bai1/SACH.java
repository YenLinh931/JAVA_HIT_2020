package Bai1;

import java.util.Scanner;

public class SACH {
    private String maSach;
    private String tenSach;
    private String NXB;
    private int soTrang;
    private float giaTien;

    public void NHAP(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        maSach=sc.nextLine();
        System.out.print("Nhập tên sách: ");
        tenSach=sc.nextLine();
        System.out.print("Nhập nhà xuất bản: ");
        NXB=sc.nextLine();
        System.out.print("Nhập số trang: ");
        soTrang=sc.nextInt();
        System.out.print("Nhập giá tiền: ");
        giaTien=sc.nextFloat();
    }
    public void XUAT(){
        System.out.println("Mã sách: "+maSach+"     "+"Tên sách: "+tenSach+"        "+"Nhà xuất bản: "+NXB+"        "+"Số trang: "+soTrang+"        "+"Gía tiền: "+giaTien+"        ");
    }
}
