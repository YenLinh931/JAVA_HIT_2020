package BTVN_Buoi3.Bai4;

import java.util.Scanner;

public class Array {
    private int n;
    private int[] A;
    public void InputData(){
        Scanner yl=new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng n= ");
        n=yl.nextInt();
        A=new int[n];
        for(int i=0;i<A.length;i++)
        {
            System.out.println("Nhập phần tử thứ "+(i+1));
            A[i]=yl.nextInt();
        }
    }
    public void Show(){
        System.out.println("Mảng vừa nhập là: ");
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+"     ");
        }
    }
    public int Sum(){
        int Sum=0;
        for(int i=0;i<A.length;i++)
        {
            Sum+=A[i];
        }
        return Sum;
    }

    public Array() {
    }

    public Array(int n, int[] a) {
        this.n = n;
        A = a;
    }

    public int getN() {
        return n;
    }

    public int[] getA() {
        return A;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setA(int[] a) {
        A = a;
    }
}
