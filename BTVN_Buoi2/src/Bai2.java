import java.util.Scanner;

public class Bai2
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Nhập số phần tử của mảng n= ");
        Scanner yl=new Scanner(System.in);
        n=yl.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            System.out.print("a["+i+"]= ");
            a[i]=yl.nextInt();
        }
        TimKiem(a);
        SapXep(a);
    }

    public static void TimKiem(int[] a)
    {
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)    max=a[i];
        }
        System.out.println("Số lớn nhất có trong mảng là: "+max);
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)    min=a[i];
        }
        System.out.println("Số nhỏ nhất có trong mảng là: "+min);
    }

    public static void SapXep(int[] a)
    {
        System.out.print("Mảng sau khi sắp xếp là: ");
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int tmp=a[i];
                    a[i]=a[j];
                    a[j]=tmp;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print("   "+a[i]);
        }
    }
}
