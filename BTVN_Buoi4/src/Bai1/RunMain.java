package Bai1;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        int n;
        SACH[] S;
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập n = ");
        n=sc.nextInt();
        S=new SACH[n];
        for(int i=0;i<n;i++)
        {
            S[i]=new SACH();
            System.out.println("Nhập thông tin sách thứ "+(i+1));
            S[i].NHAP();
        }
        for(int i=0;i<n;i++)
        {
            S[i].XUAT();
        }
    }
}
