package Bai2;

import java.util.Scanner;

public class DATE {
    private int D;
    private int M;
    private int Y;

    public void NHAP(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập ngày: ");
        D=sc.nextInt();
        System.out.print("Nhập tháng: ");
        M=sc.nextInt();
        System.out.print("Nhập năm: ");
        Y=sc.nextInt();
    }
    public void XUAT(){
        System.out.println("Date: "+D+"/ "+M+"/ "+Y);
    }
}
