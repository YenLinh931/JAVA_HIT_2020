package Bai3;

import java.util.Scanner;

public class PHIEU {
    private String maPhieu;
    HANG[] x;
    int n;

    public void NHAP(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập mã phiếu: ");
        maPhieu=sc.nextLine();
        System.out.print("Nhập n= ");
        n=sc.nextInt();
        x=new HANG[n];
        for(int i=0;i<x.length;i++)
        {
            System.out.println("Nhập thông tin mặt hàng thứ "+(i+1));
            x[i]=new HANG();
            x[i].NHAP();
        }
    }
    public void XUAT(){
        System.out.println("Mã Phiếu: "+maPhieu);
        for(int i=0;i<x.length;i++)
        {
            System.out.println("\t\tTHÔNG TIN MẶT HÀNG THỨ "+(i+1));
            x[i].XUAT();
        }
    }
}
