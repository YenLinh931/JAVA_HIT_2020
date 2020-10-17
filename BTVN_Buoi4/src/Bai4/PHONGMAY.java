package Bai4;

import java.util.Scanner;

public class PHONGMAY {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    QUANLY x;
    MAY[] y;
    int n;

    public void NHAP(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập mã phòng: ");
        maPhong=sc.nextLine();
        System.out.print("Nhập tên phòng: ");
        tenPhong=sc.nextLine();
        System.out.print("Nhập diện tích: ");
        dienTich=sc.nextInt();
        x=new QUANLY();
        x.NHAP();
        System.out.print("Nhập số máy của phòng máy n= ");
        n=sc.nextInt();
        y=new MAY[n];
        for(int i=0;i<n;i++)
        {
            y[i]=new MAY();
            System.out.println("Nhập thông tin máy thứ "+(i+1));
            y[i].NHAP();
        }
    }
    public void XUAT(){
        System.out.println("Mã phòng: "+maPhong);
        System.out.println("Tên phòng: "+tenPhong);
        System.out.println("Diện tích: "+dienTich);
        x.XUAT();
        for(int i=0;i<n;i++)
        {
            System.out.println("----------------------------------");
            y[i].XUAT();
        }
    }
}
