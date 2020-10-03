import java.util.Scanner;

public class Bai1
{
    public static void main(String[] args)
    {
        Scanner yl= new Scanner(System.in);
        int a,b,c;
        System.out.print("Nhập 3 số a,b,c lần lượt là:  ");
        a=yl.nextInt();
        b=yl.nextInt();
        c=yl.nextInt();
        int max=a;
        if(b>max)   max=b;
        if(c>max)   max=c;
        System.out.print("Số lớn nhất trong các số vừa nhập là: "+max);
    }
}
