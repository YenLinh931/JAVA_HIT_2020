import java.util.Scanner;

public class Bai4
{
    static Scanner yl=new Scanner(System.in);
    public static void main(String[] args)
    {
        int n;
        System.out.print("Nhập số phần tử của mảng n= ");
        n=yl.nextInt();
        int[]a=new int[n];
        for(int i=0;i<a.length;i++)
        {
            System.out.print("a["+i+"]= ");
            a[i]=yl.nextInt();
        }
        Sum(a);
    }
    public static boolean Prime(int n)
    {
        if(n<2)     return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)  return false;
        }
        return true;
    }

    public static int SumPrime(int i)
    {
        int k=0,S=0;
        for(int j=2;;j++)
        {
            if(Prime(j))
            {
                S+=j;
                k++;
            }
            if(k>i)    break;
        }
        return S;
    }

    public static void Sum(int[] a)
    {
        int Sum=0;
        for(int i=0;i<a.length;i++)
        {
            Sum+=Prime(a[i])?a[i]+SumPrime(i)-i:a[i];
        }
        System.out.print("Tổng cần tính là "+Sum);
    }
}
