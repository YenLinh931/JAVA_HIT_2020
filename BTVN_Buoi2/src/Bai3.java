import java.util.Scanner;

public class Bai3
{
    static Scanner yl=new Scanner(System.in);
    public static void main(String[] args)
    {
        int n;
        System.out.print("Nhập số phần tử của mảng n= ");
        n=yl.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++)
        {
            System.out.print("a["+i+"]= ");
            a[i]=yl.nextInt();
        }
        do {
            System.out.println("\n1.Hiển thị mảng vừa tạo");
            System.out.println("2.Thêm một phần tử vào vị trí k");
            System.out.println("3.Xóa một phần tử ở vị trí k");
            System.out.println("4.Đảo ngược mảng");
            System.out.println("5. Hiển thị phần tử a[1] và các số chia hết cho a[1]");
            System.out.println("0.Thoát");
            System.out.println("Mời Bạn Chọn");
            int chon;
            chon=yl.nextInt();
            switch (chon)
            {
                case 1:HienThi(a);  break;
                case 2:Them(a);     break;
                case 3:Xoa(a);      break;
                case 4:DaoNguoc(a); break;
                case 5:HienThi2(a); break;
                case 0:
                    System.out.println("Đóng Chuong Trình!!!");
                    System.exit(0);
                default:
                    System.out.println("Mời bạn chọn lại: ");
            }
        }
        while (true);
    }

    public static void HienThi(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print("   "+a[i]);
        }
        System.out.println();
    }

    public static void Them(int[] a)
    {
        int k,x;
        do
        {
            System.out.print("Nhập vị trí muốn thêm: ");
            k = yl.nextInt();
         }
        while(k>a.length||k<0);
        System.out.print("Nhập số muốn thêm: ");
        x=yl.nextInt();
        int b[]=new int[a.length+1];
        for(int i=0;i<b.length-1;i++)
        {
            b[i]=a[i];
        }
        for(int i=b.length-1;i>=k;i--)
        {
            b[i]=b[i-1];
        }
        b[k]=x;
        System.out.println("Mảng sau khi thêm là: ");
        HienThi(b);
    }

    public static void Xoa(int []a)
    {
        int k;
        System.out.print("Nhập vị trí muốn xóa: ");
        k=yl.nextInt();
        int[] d=new int[a.length];
        int[] c=new int[a.length-1];
        for (int i =0;i<a.length;i++)
        {
            d[i] = a[i];
        }
        for(int i=k;i<d.length-1;i++)
        {
            d[i]=d[i+1];
        }
        for(int i=0;i<c.length;i++)
        {
            c[i] = d[i];
        }
        System.out.println("Mảng sau khi xóa là: ");
        HienThi(c);
    }

    public static void DaoNguoc(int[] a)
    {
        System.out.print("Mảng sau khi đảo ngược là: ");
        for(int i= a.length-1;i>=0;i--)
        {
            System.out.print("  "+a[i]);
        }
    }

    public static void HienThi2(int[] a)
    {
        System.out.print("Phần tử a[1] của mảng là: ");
        System.out.println(a[1]);
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%a[1]==0) System.out.print(" "+a[i]);
        }

    }
}
